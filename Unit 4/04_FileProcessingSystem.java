// 14. File Processing System
// Create a class FileProcessingSystem. Simulate file reading using try-catch. Use finally block to display cleanup message.
// Output: 'Reading file...' and 'Closing file resources'

import java.io.*;

class FileProcessingSystem {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("test.txt");
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            System.out.println("Closing file resources");
        }
    }
}