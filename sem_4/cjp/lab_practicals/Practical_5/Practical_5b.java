class A3 {
    void hello(String s) {
        System.out.println("A3: Hello from " + s);
    }
}

class B3 extends A3 {
    @Override
    void hello(String s) {
        super.hello(s);
        System.out.println("B3: Hello from " + s);
    }
}

public class Practical_5b {
    public static void main(String[] args) {

        A3 obj1 = new A3();
        System.out.println("===== A3 reference, A3 object =====");
        obj1.hello("Java");

        System.out.println();

        A3 obj2 = new B3();
        System.out.println("===== A3 reference, B3 object (Dynamic Dispatch) =====");
        obj2.hello("Java");

        System.out.println();

        B3 obj3 = new B3();
        System.out.println("===== B3 reference, B3 object =====");
        obj3.hello("Java");
    }
}
