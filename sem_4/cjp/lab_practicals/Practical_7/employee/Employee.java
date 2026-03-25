package employee;

import java.util.Scanner;

public class Employee {
    protected String name;
    protected int emp_num;
    protected String gender;

    public void input_data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name       : ");
        name = sc.nextLine();
        System.out.print("Enter Emp Number : ");
        emp_num = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Gender (M/F): ");
        gender = sc.nextLine();
    }

    public void show_data() {
        System.out.println("Name        : " + name);
        System.out.println("Emp Number  : " + emp_num);
        System.out.println("Gender      : " + gender);
    }
}
