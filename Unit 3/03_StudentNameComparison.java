// 3. Define a class StudentNameComparison.
// •	Accept two student names. 
// •	Compare them using case-sensitive comparison. 
// •	Compare them using case-insensitive comparison. 
// •	Display appropriate message. 

import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String n1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String n2 = sc.nextLine();

        if (n1.equals(n2))
            System.out.println("Case-sensitive: Same");
        else
            System.out.println("Case-sensitive: Different");

        if (n1.equalsIgnoreCase(n2))
            System.out.println("Case-insensitive: Same");
        else
            System.out.println("Case-insensitive: Different");
    }
}