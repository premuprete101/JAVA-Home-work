// 5. Define a class FileExtensionExtractor.
// •	Accept a file name (example: "report.pdf"). 
// •	Extract file extension using substring() method. 
// •	Display extracted extension. 

import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        int index = file.lastIndexOf(".");
        String ext = file.substring(index + 1);

        System.out.println("Extension: " + ext);
    }
}