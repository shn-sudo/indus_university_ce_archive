class Person {
    String name;
    int age;
    double salary;
    
    Person() {
        name = "Unknown";
        age = 0;
        salary = 0.0;
    }
    
    Person(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }
}

public class Practical_4a {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Ted", 25, 50000);
        
        person1.display();
        person2.display();
    }
}