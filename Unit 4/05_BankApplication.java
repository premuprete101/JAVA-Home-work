// 15. Bank Application
// Create a class BankApplication. Define method that throws exception using throws. Call method in main and handle exception.
// Output: 'Transaction processed' or 'Exception handled in main'


import java.util.Scanner;

class BankApplication {

    static void processTransaction(int balance, int withdraw) throws Exception {
        if (withdraw > balance)
            throw new Exception("Low Balance");
        else
            System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdraw amount: ");
        int withdraw = sc.nextInt();

        try {
            processTransaction(balance, withdraw);
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}