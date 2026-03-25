import java.util.Scanner;

class Employee {
    protected String name;
    protected int emp_numb;
    protected char gender;

    public Employee(String name, int emp_numb, char gender) {
        this.name = name;
        this.emp_numb = emp_numb;
        this.gender = Character.toUpperCase(gender);
    }

    public void showData() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Employee Number: " + emp_numb);
        System.out.println("Gender: " + gender);
    }
}

class SalariedEmployee extends Employee {
    private double salary;
    private double hra;
    private double da;

    public SalariedEmployee(String name, int emp_numb, char gender, double salary) {
        super(name, emp_numb, gender);
        this.salary = salary;
    }

    public void allowance() {
        if (gender == 'F') {
            hra = 0.1 * salary;
        } else {
            hra = 0.09 * salary;
        }
        da = 0.05 * salary;
    }

    public void increment() {
        salary = salary + (0.1 * salary);
    }

    public double getGrossSalary() {
        return salary + hra + da;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Base Salary: " + salary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.printf("Gross Salary: %.2f\n", getGrossSalary());
    }
}

public class Practical_5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Number: ");
        int id = sc.nextInt();
        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        SalariedEmployee emp = new SalariedEmployee(name, id, gender, sal);

        emp.allowance();
        emp.increment();
        
        emp.showData();
        
        sc.close();
    }
}
