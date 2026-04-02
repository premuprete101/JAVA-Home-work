// 2. Design a program EmailChecker.
// •	Accept an email address from the user. 
// •	Check whether the email contains "@gmail.com". 
// •	Display "Valid Gmail Address" or "Invalid Email". 

import java.util.Scanner;

class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        if (email.contains("@gmail.com"))
            System.out.println("Valid Gmail Address");
        else
            System.out.println("Invalid Email");
    }
}