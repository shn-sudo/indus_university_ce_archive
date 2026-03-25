
class Employee {
    String empCode;
    String name;
    String designation;
    double basicPay;
    double hra;
    double da;
    double totalPay;
    
    Employee(String code, String empName, String desig, double basic) {
        empCode = code;
        name = empName;
        designation = desig;
        basicPay = basic;
        calculatePay();
    }
    
    void calculatePay() {
        hra = 0.10 * basicPay;  
        da = 0.45 * basicPay;   
        totalPay = basicPay + hra + da;
    }
    
    void printDetails() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: Rs. " + basicPay);
        System.out.println("HRA (10%): Rs. " + hra);
        System.out.println("DA (45%): Rs. " + da);
        System.out.println("Total Pay: Rs. " + totalPay);
        System.out.println("========================================");
    }
}

public class Practical_4b {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("E001", "Ted Kumar", "Manager", 50000);
        Employee emp2 = new Employee("E002", "Richard Sharma", "Senior Developer", 40000);
        Employee emp3 = new Employee("E003", "Miles Patel", "Team Lead", 45000);
        
        System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====\n");
        
        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
        
        System.out.println("Total employees processed: 3");
    }
}