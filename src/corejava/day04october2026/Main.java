package corejava.day04october2026;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args){
            //verifyAge(27);
        FileManager fileManager = new FileManager();
        try {
            fileManager.openFile("src/corejava/day04october2026/test.txt");
            System.out.println("File open successfully");
        } catch(FileNotFoundException e){
            System.out.println("File Not Found: " + e.getMessage());
        }
    }
   /* public static void verifyAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Access denied: " +
                    "you must be at least 18");
        }
        System.out.println("Access granted: ");
    }
    */
}
