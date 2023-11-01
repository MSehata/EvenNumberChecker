package org.example;

import java.util.Scanner;

public class OddEvenChecker {


    public static void checkOddEven(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("Number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Please enter an even number: ");
                int userInput = scanner.nextInt();

                checkOddEven(userInput);
                System.out.println("The number is even.");
                validInput = true;
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next();
            }
        }
        scanner.close();

    }
}
