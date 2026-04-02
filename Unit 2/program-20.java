class Employee {
    String name;
    double salary;

    
    Employee(String name, double salary) {
        this.name = name;       
        this.salary = salary;
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


public class Main {
    public static void main(String[] args) {

        
        Employee e1 = new Employee("Ashish", 50000);
        Employee e2 = new Employee("Rahul", 40000);

        
        e1.display();
        System.out.println();
        e2.display();
    }
}