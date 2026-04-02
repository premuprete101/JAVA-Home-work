class Employee {
    String name;
    int id;

    // Static variable
    static int employeeCount = 0;

    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++; 
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

    
        Employee e1 = new Employee("Ashish", 101);
        Employee e2 = new Employee("Rahul", 102);
        Employee e3 = new Employee("Priya", 103);

        
        Employee.displayCount();
    }
}