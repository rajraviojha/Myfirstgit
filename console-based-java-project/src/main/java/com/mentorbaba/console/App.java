package com.mentorbaba.console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to this Java Program!");

        // Perform a simple calculation
        int result = performSimpleCalculation();

        // Display the result
        System.out.println("The result of the calculation is: " + result);
    }

    private static int performSimpleCalculation() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition
        int sum = num1 + num2;

        scanner.close();

        return sum;
    }
}