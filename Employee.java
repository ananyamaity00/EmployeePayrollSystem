package src;

public class Employee {
    private String id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Employee(String id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displayPayroll() {
        System.out.printf("Employee ID   : %s%n", id);
        System.out.printf("Name          : %s%n", name);
        System.out.printf("Hourly Rate   : $%.2f%n", hourlyRate);
        System.out.printf("Hours Worked  : %d%n", hoursWorked);
        System.out.printf("Total Salary  : $%.2f%n", calculateSalary());
        System.out.println("-----------------------------------");
    }
}
