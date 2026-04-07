// PRACTICAL 9.1 — Three Threads using Thread class
// Thread 1 → prints 'a' 100 times
// Thread 2 → prints 'b' 100 times
// Thread 3 → prints integers 1 to 100

class Practical9_a {
    public static void main(String[] args) throws InterruptedException {
        PrintA t1 = new PrintA();
        PrintB t2 = new PrintB();
        PrintNumbers t3 = new PrintNumbers();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All threads completed.");
    }
}

class PrintA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("a ");
        }
        System.out.println("\n[Thread-A finished]");
    }
}

class PrintB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("b ");
        }
        System.out.println("\n[Thread-B finished]");
    }
}

class PrintNumbers extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n[Thread-Numbers finished]");
    }
}
