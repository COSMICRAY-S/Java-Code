import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String args[])throws IOException{
        Socket s1 = new Socket("localhost", 1255);
        
        // Get an input file handle from the socket and read the input
        InputStream s1In = s1.getInputStream();
        DataInputStream dis = new DataInputStream(s1In);
        
        // Read and print the message from the server
        String st = new String(dis.readUTF());
        System.out.println(st);
        
        // Close the connection
        dis.close();
        s1In.close();
        s1.close();
    }
}