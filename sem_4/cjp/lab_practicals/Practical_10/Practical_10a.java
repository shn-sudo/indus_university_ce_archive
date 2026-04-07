// PRACTICAL 10.1 — File Copy using Character, Byte & Buffered Streams
// Usage: java Practical10_1 source.txt destination
// Output files: destination_char.txt, destination_byte.txt, destination_buffered.txt

import java.io.*;

public class Practical_10a {

    // 1. Character Stream — FileReader / FileWriter
    static void copyCharacterStream(String src, String dst) throws IOException {
        try (FileReader reader = new FileReader(src);
             FileWriter writer = new FileWriter(dst + "_char.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }
        }
        System.out.println("Character stream copy done → " + dst + "_char.txt");
    }

    // 2. Byte Stream — FileInputStream / FileOutputStream
    static void copyByteStream(String src, String dst) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dst + "_byte.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        }
        System.out.println("Byte stream copy done → " + dst + "_byte.txt");
    }

    // 3. Buffered Stream — BufferedReader / BufferedWriter
    static void copyBufferedStream(String src, String dst) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dst + "_buffered.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        }
        System.out.println("Buffered stream copy done → " + dst + "_buffered.txt");
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Practical10_1 <source> <destination>");
            return;
        }
        String source      = args[0];
        String destination = args[1];

        try {
            copyCharacterStream(source, destination);
            copyByteStream(source, destination);
            copyBufferedStream(source, destination);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
