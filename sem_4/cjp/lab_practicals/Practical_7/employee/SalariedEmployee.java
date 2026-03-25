package employee;

public class SalariedEmployee extends Employee {
    protected double salary;

    // Override input_data to also take salary
    @Override
    public void input_data() {
        super.input_data();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        salary = sc.nextDouble();
    }

    // HRA: 10% for female, 9% for male
    // DA : 5% for all
    public double allowance() {
        double hra, da;
        if (gender.equalsIgnoreCase("F")) {
            hra = 0.10 * salary;
        } else {
            hra = 0.09 * salary;
        }
        da = 0.05 * salary;

        System.out.println("\n--- Allowance Details ---");
        System.out.println("HRA         : " + hra);
        System.out.println("DA          : " + da);

        return hra + da;
    }

    // Increment: salary increased by 1%
    public void increment() {
        salary = salary + 0.01 * salary;
        System.out.println("Salary after Increment: " + salary);
    }

    @Override
    public void show_data() {
        super.show_data();
        System.out.println("Basic Salary: " + salary);
    }
}
