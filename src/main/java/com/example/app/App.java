package com.example.app;

import java.util.Random;

public class App {
    // Method to add two numbers
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Main method
    public static void main(String[] args) {
        Random random = new Random();

        // Generate two random numbers between 1 and 100
        int num1 = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int num2 = random.nextInt(100) + 1; // Generates a random number between 1 and 100

        // Calculate and display the result
        int sum = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

