// Interface
interface Shape2D {
    double getArea();
}

// Class to hold 3D point
class Point3D {
    double x, y, z;
    Point3D(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

// Abstract class Shape
abstract class Shape {
    abstract void display();
}

// Circle extends Shape and implements Shape2D
class Circle extends Shape implements Shape2D {
    double radius;
    Point3D center;

    Circle(double radius, Point3D center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("Circle Details:");
        System.out.println("  Center  : " + center);
        System.out.println("  Radius  : " + radius);
        System.out.println("  Area    : " + getArea());
    }
}

// Main class
public class Practical_6b {
    public static void main(String[] args) {
        Point3D center = new Point3D(1.0, 2.0, 3.0);
        Circle c = new Circle(5.0, center);

        c.display();

        // Calling via Shape2D interface reference
        Shape2D s2d = c;
        System.out.println("\nArea via Shape2D interface: " + s2d.getArea());

        // Calling via Shape reference
        Shape s = c;
        System.out.println("\nDisplay via Shape reference:");
        s.display();
    }
}
