// import java.io.*;
// import java.net.*;

// public class TextBasedSearchEngine {
//     private String searchEngine;

//     public TextBasedSearchEngine(String searchEngine) {
//         this.searchEngine = searchEngine;
//     }

//     public void doSearch(String queryString) {
//         try {
//             // Open a URL connection
//             URL url = new URL(searchEngine);
//             URLConnection connection = url.openConnection();
//             connection.setDoOutput(true);

//             PrintStream ps=new PrintStream(connection.getOutputStream());
//             ps.println(queryString);
//             ps.close();

//             DataInputStream input=new DataInputStream(connection.getInputStream());
//             String inputLine = null;

//             // Read the result
//             while ((inputLine = input.readLine()) != null) {
//                 System.out.println(inputLine);
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         QueryStringFormatter formatter = new QueryStringFormatter("http://search.yahoo.com/search");
//         formatter.addQuery("newwindow", "1");
//         formatter.addQuery("q", "Xingchen Chu Rajkumar Buyya");

//         // Search it via Yahoo
//         TextBasedSearchEngine search = new TextBasedSearchEngine(formatter.getEngine());
//         search.doSearch(formatter.getQueryString());
//     }
// }

// import java.io.*;
// import java.net.*;

// public class TextBasedSearchEngine {
//     private String searchEngine;

//     public TextBasedSearchEngine(String searchEngine) {
//         this.searchEngine = searchEngine;
//     }

//     public void doSearch(String queryString) {
//         try {
//             // Correct way: Append the query string to the URL
//             URL url = new URL(searchEngine + queryString);
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//             connection.setRequestMethod("GET");

//             BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//             String inputLine;

//             // Read the result
//             while ((inputLine = input.readLine()) != null) {
//                 System.out.println(inputLine);
//             }
//             input.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         QueryStringFormatter formatter = new QueryStringFormatter("https://search.yahoo.com/search");
//         formatter.addQuery("q", "Xingchen Chu Rajkumar Buyya");

//         // Search it via Yahoo
//         TextBasedSearchEngine search = new TextBasedSearchEngine(formatter.getEngine());
//         search.doSearch(formatter.getQueryString());
//     }
// }


import java.io.*;
import java.net.*;
import java.util.*;

class QueryStringFormatter {
    private StringBuilder queryString;
    private String searchEngine;

    public QueryStringFormatter(String searchEngine) {
        this.searchEngine = searchEngine;
        this.queryString = new StringBuilder();
    }

    public void addQuery(String key, String value) {
        if (queryString.length() > 0) {
            queryString.append("&");
        }
        try {
            queryString.append(URLEncoder.encode(key, "UTF-8"))
                       .append("=")
                       .append(URLEncoder.encode(value, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String getQueryString() {
        return queryString.toString();
    }

    public String getEngine() {
        return searchEngine;
    }
}

public class TextBasedSearchEngine {
    private String searchEngine;

    public TextBasedSearchEngine(String searchEngine) {
        this.searchEngine = searchEngine;
    }

    public void doSearch(String queryString) {
        try {
            URL url = new URL(searchEngine + "?" + queryString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        QueryStringFormatter formatter = new QueryStringFormatter("https://www.google.com/search");
        formatter.addQuery("q", "Xingchen Chu & Rajkumar Buyya");

        TextBasedSearchEngine search = new TextBasedSearchEngine(formatter.getEngine());
        search.doSearch(formatter.getQueryString());
    }
}
