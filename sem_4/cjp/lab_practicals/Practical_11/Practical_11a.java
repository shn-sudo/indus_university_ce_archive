// PRACTICAL 11.1 — Demonstration of Stack, Vector and ArrayList

import java.util.*;

public class Practicalr_11a {
    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────
        // STACK
        // ─────────────────────────────────────────────────────
        System.out.println("========== STACK ==========");
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack after push(10,20,30,40) : " + stack);
        System.out.println("peek()  → top element         : " + stack.peek());
        System.out.println("pop()   → removes top         : " + stack.pop());
        System.out.println("Stack after pop()             : " + stack);
        System.out.println("isEmpty()                     : " + stack.isEmpty());
        System.out.println("search(20) (1-based from top) : " + stack.search(20));

        // ─────────────────────────────────────────────────────
        // VECTOR
        // ─────────────────────────────────────────────────────
        System.out.println("\n========== VECTOR ==========");
        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        System.out.println("Vector                        : " + vector);
        System.out.println("size()                        : " + vector.size());
        System.out.println("get(1)                        : " + vector.get(1));
        vector.remove("Banana");
        System.out.println("After remove(\"Banana\")        : " + vector);
        System.out.println("contains(\"Cherry\")            : " + vector.contains("Cherry"));
        System.out.println("firstElement()                : " + vector.firstElement());
        System.out.println("lastElement()                 : " + vector.lastElement());

        // ─────────────────────────────────────────────────────
        // ARRAYLIST
        // ─────────────────────────────────────────────────────
        System.out.println("\n========== ARRAYLIST ==========");
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(7);
        System.out.println("ArrayList                     : " + list);
        System.out.println("size()                        : " + list.size());

        list.add(2, 99);                           // insert 99 at index 2
        System.out.println("After add(2, 99)              : " + list);

        list.remove(Integer.valueOf(3));           // remove element with value 3
        System.out.println("After remove value 3          : " + list);

        Collections.sort(list);
        System.out.println("After sort()                  : " + list);
        System.out.println("indexOf(99)                   : " + list.indexOf(99));
        System.out.println("get(0)  → smallest            : " + list.get(0));
    }
}
