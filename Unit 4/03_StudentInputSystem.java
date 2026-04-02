// 13. Student Input System
// Create a class StudentInputSystem. Accept student age from user. Handle invalid input using multiple catch blocks such as InputMismatchException and ArithmeticException.
// Output: If valid: 'Student age is: <age>' Else: 'Invalid input'

import java.util.Scanner;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Age: " + age);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}