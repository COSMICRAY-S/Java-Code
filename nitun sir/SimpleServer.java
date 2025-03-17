import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String args[]) throws IOException {
        ServerSocket s = new ServerSocket(1255);
        Socket s1 = s.accept();

        OutputStream slout = s1.getOutputStream();
        DataOutputStream dos = new DataOutputStream(slout);
        
        dos.writeUTF("Hi there. You are almost done");
        
        dos.close();
        slout.close();
        s1.close();
    }
}