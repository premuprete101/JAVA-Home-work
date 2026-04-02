// 11. ATM Withdrawal System
// Create a class ATMWithdrawal. Accept account balance and withdrawal amount from the user. If withdrawal amount is greater than balance, throw an exception manually using throw. Otherwise deduct amount and display updated balance.
// Output: If sufficient balance: 'Withdrawal successful. Remaining balance: <balance>' Else: 'Insufficient Balance'

import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        try {
            if (amt > balance)
                throw new Exception("Insufficient Balance");
            else
                System.out.println("Withdrawal Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}