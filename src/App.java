/**
 *  Write a Java program that reads an unspecified number of integers from the user 
 *  until the user enters -1. For each number, indicate whether it is odd or even. 
 *  After the user enters -1, print the count of even and odd numbers entered.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 1;
        int oddnumbers = 0;
        int evennumbers = 0;
        
        while (true) {
            System.out.println("Give a number");
           int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            }else if (numbers % 2 == 0) {
                System.out.println("The number is even");
                evennumbers = evennumbers + 1;
            }else {
                System.out.println("The number is odd");
                oddnumbers = oddnumbers + 1;
            }

    }
    System.out.println("Even numbers: " + evennumbers + "," + " Odd numbers: " + oddnumbers);
}
}
