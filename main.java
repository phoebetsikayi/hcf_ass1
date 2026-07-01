// Abstract class (Abstraction)
abstract class Employee {
    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation (Getters)
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Display employee details
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

// Inheritance
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Polymorphism (Method Overriding)
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public class EmployeeManagement {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee("Faith Tsikayi", 101, 1500.00);
        Employee emp2 = new PartTimeEmployee("John Moyo", 102, 15.00, 80);

        System.out.println("=== Full-Time Employee ===");
        emp1.displayInfo();
        System.out.println("Salary: $" + emp1.calculateSalary());

        System.out.println("\n=== Part-Time Employee ===");
        emp2.displayInfo();
        System.out.println("Salary: $" + emp2.calculateSalary());
    }
}
