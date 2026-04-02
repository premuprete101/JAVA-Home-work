// 4. Create a class MessageFormatter.
// •	Accept first name and last name. 
// •	Concatenate both names with space. 
// •	Display full name in proper format. 

import java.util.Scanner;

class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = sc.nextLine();

        System.out.print("Enter last name: ");
        String last = sc.nextLine();

        String full = first + " " + last;
        System.out.println("Full Name: " + full);
    }
}