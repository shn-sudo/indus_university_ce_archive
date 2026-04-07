// PRACTICAL 12.1 — Circle Area CLIENT
// Make sure CircleServer.java is already running before executing this.
// Enter a radius → server returns the area of the circle.
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class CircleClient {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int    port = 5000;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        try (Socket socket = new Socket(host, port)) {
            PrintWriter    out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in  = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            // Send radius to server
            out.println(radius);

            // Receive computed area from server
            String response = in.readLine();
            System.out.printf("Area of circle with radius %.2f = %s%n", radius, response);
        }
    }
}
