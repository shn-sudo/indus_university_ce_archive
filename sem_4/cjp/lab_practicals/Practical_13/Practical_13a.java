// PRACTICAL 13.1 — Count Occurrence of Each Character in a String

import java.util.*;

public class Practical13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // LinkedHashMap preserves the order characters first appear
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("\nCharacter frequencies in: \"" + input + "\"");
        System.out.println("----------------------------------");
        System.out.printf("%-15s %s%n", "Character", "Count");
        System.out.println("----------------------------------");

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char ch = entry.getKey();
            String display = (ch == ' ') ? "(space)" : String.valueOf(ch);
            System.out.printf("%-15s %d%n", display, entry.getValue());
        }

        System.out.println("----------------------------------");
        System.out.println("Total distinct characters : " + freqMap.size());
        System.out.println("Total characters in string: " + input.length());
    }
}
