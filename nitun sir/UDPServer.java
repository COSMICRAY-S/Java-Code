// UDPServer.java: A simple UDP server program.
import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String args[]) {
        DatagramSocket aSocket = null;
        if (args.length < 1) {
            System.out.println("Usage: java UDPServer <Port number>");
            System.exit(1);
        }

        try {
            int serverPort = Integer.parseInt(args[0]);
            aSocket = new DatagramSocket(serverPort);
            byte[] buffer = new byte[1000];

            System.out.println("UDP Server is running on port " + serverPort);

            while (true) {
                DatagramPacket request = new DatagramPacket(buffer, buffer.length);
                aSocket.receive(request);
                
                String receivedMessage = new String(request.getData(), 0, request.getLength());
                System.out.println("Received: " + receivedMessage);

                // Create a response message
                String responseMessage = "Server received: " + receivedMessage;
                byte[] responseData = responseMessage.getBytes();

                DatagramPacket reply = new DatagramPacket(
                    responseData, responseData.length, request.getAddress(), request.getPort()
                );
                aSocket.send(reply);
            }
        } 
        catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        } 
        finally {
            if (aSocket != null)
                aSocket.close();
        }
    }
}

/* java UDPServer 6789 // java UDPClient "Hello Server" localhost 6789 */