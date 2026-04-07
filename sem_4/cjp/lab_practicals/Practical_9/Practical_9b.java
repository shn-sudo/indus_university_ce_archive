// PRACTICAL 9.2 — Three Threads using Runnable Interface
// Thread 1 → prints 'a' 100 times
// Thread 2 → prints 'b' 100 times
// Thread 3 → prints integers 1 to 100

class RunnableA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a ");
        }
        System.out.println("\n[Runnable-A finished]");
    }
}

class RunnableB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("b ");
        }
        System.out.println("\n[Runnable-B finished]");
    }
}

class RunnableNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n[Runnable-Numbers finished]");
    }
}

public class Practical_9b {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableA());
        Thread t2 = new Thread(new RunnableB());
        Thread t3 = new Thread(new RunnableNumbers());

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All Runnable threads completed.");
    }
}
