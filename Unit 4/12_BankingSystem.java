// 22. Banking System
// Create a class BankingSystem. Multiple threads access shared account balance using synchronized block.
// Output: Balance deduction messages.


class BankingSystem {

    int balance = 1000;

    void withdraw(String name, int amount) {

        synchronized (this) {
            if (balance >= amount) {
                System.out.println(name + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(name + ": Insufficient balance");
            }
        }
    }
}

class Customer extends Thread {

    BankingSystem b;
    String name;
    int amount;

    Customer(BankingSystem b, String name, int amount) {
        this.b = b;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        b.withdraw(name, amount);
    }
}

class BankingDemo {
    public static void main(String[] args) {

        BankingSystem b = new BankingSystem();

        Customer c1 = new Customer(b, "Om", 700);
        Customer c2 = new Customer(b, "Rahul", 500);

        c1.start();
        c2.start();
    }
}