
class Staff {
    void work() {
        System.out.println("Staff is working.");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor is treating patients.");
    }
}

// Nurse class
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse is assisting doctors and caring for patients.");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist is handling appointments and calls.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Staff s;

        s = new Doctor();
        s.work();

        s = new Nurse();
        s.work();

        s = new Receptionist();
        s.work();
    }
}