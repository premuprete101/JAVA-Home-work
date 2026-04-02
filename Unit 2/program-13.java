// Abstract class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    abstract double calculateBonus();

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}


class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.20; 
    }
}


class Developer extends Employee {
    double salary;
    double incentive;

    Developer(String name, int id, double salary, double incentive) {
        super(name, id);
        this.salary = salary;
        this.incentive = incentive;
    }

    double calculateBonus() {
        return (salary * 0.10) + incentive; 
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        
        Employee e1 = new Manager("Ashish", 101, 50000);
        Employee e2 = new Developer("Rahul", 102, 40000, 5000);

        // Manager
        e1.display();
        System.out.println("Bonus: " + e1.calculateBonus());

        System.out.println();

        
        e2.display();
        System.out.println("Bonus: " + e2.calculateBonus());
    }
}