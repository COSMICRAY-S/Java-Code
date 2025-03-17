import java.util.*;

public class k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while (t-- > 0) {
            String str = sc.nextLine();
            int s = str.length();
            
            for (int i = 0; i < s - 2; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("i");
        }
        
        sc.close();
    }
}
