import java.io.*;
import java.net.*;

public class CircleServer {
    public static void main(String[] args) throws IOException {
        int port = 5000;
        System.out.println("Circle Server started. Listening on port " + port + " ...");

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                BufferedReader in  = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter    out = new PrintWriter(
                        clientSocket.getOutputStream(), true);

                // Read radius sent by client
                String line   = in.readLine();
                double radius = Double.parseDouble(line.trim());

                // Compute area
                double area = Math.PI * radius * radius;

                System.out.printf("Received radius = %.2f  |  Sending area = %.4f%n", radius, area);

                // Send area back to client
                out.println(area);

                clientSocket.close();
                System.out.println("Client disconnected. Waiting for next client...\n");
            }
        }
    }
}
