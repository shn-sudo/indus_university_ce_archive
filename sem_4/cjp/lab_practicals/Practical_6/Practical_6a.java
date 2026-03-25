abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    Circle(double r) { this.radius = r; }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    double height, base;
    Triangle(double h, double b) { this.height = h; this.base = b; }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    double side;
    Square(double s) { this.side = s; }
    
    @Override
    double area() {
        return side * side;
    }
}

public class Practical_6a {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Shape s;

        s = new Circle(7);
        System.out.println("Circle Area     : " + s.area());

        s = new Triangle(5, 10);
        System.out.println("Triangle Area   : " + s.area());

        s = new Square(4);
        System.out.println("Square Area     : " + s.area());
    }
}
