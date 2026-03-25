package employee;

public class Practical_7 {
    public static void main(String[] args) {

        SalariedEmployee emp = new SalariedEmployee();

        // Input all details
        emp.input_data();

        System.out.println("\n--- Employee Details ---");
        emp.show_data();

        // Apply increment first
        emp.increment();

        // Calculate allowances
        double totalAllowance = emp.allowance();

        // Gross Salary = salary (after increment) + HRA + DA
        double grossSalary = emp.salary + totalAllowance;

        System.out.println("\n--- Salary Summary ---");
        System.out.println("Basic Salary (after increment) : " + emp.salary);
        System.out.println("Total Allowances               : " + totalAllowance);
        System.out.println("Gross Salary                   : " + grossSalary);
    }
}
