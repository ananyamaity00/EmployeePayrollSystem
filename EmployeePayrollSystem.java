package src;

import java.util.*;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hourly Rate: ");
            double rate = sc.nextDouble();
            System.out.print("Hours Worked: ");
            int hours = sc.nextInt();
            sc.nextLine(); // consume newline

            Employee emp = new Employee(id, name, rate, hours);
            employeeList.add(emp);
        }

        System.out.println("\n===== Employee Payroll =====");
        for (Employee emp : employeeList) {
            emp.displayPayroll();
        }

        sc.close();
    }
}
