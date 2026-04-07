// PRACTICAL 10.2 — Generate Random Integers → Store in "rand.dat" → Read & Display

import java.io.*;
import java.util.Random;

public class Practical_10b {
    private static final String FILE_NAME = "rand.dat";
    private static final int COUNT = 20;

    public static void main(String[] args) {
        Random random = new Random();

        // STEP 1: Write random integers to file
        System.out.println("Writing " + COUNT + " random integers to " + FILE_NAME + ":");
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < COUNT; i++) {
                int num = random.nextInt(1000);
                dos.writeInt(num);
                System.out.print(num + " ");
            }
            System.out.println("\nWrite complete.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
            return;
        }

        // STEP 2: Read integers back from file and display
        System.out.println("\nReading integers from " + FILE_NAME + ":");
        try (DataInputStream dis = new DataInputStream(
                new FileInputStream(FILE_NAME))) {
            for (int i = 0; i < COUNT; i++) {
                System.out.print(dis.readInt() + " ");
            }
            System.out.println("\nRead complete.");
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
