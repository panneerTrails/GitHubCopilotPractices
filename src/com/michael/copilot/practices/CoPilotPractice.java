package com.michael.copilot.practices;

/**
 * A simple Java program that demonstrates the use of a `while` loop
 * to print numbers from 1 to 100.
 */
public class CoPilotPractice {

    /**
     * The main method serves as the entry point of the program.
     * It initializes a counter variable and uses a `while` loop
     * to print numbers from 1 to 100.
     *
     * @param args Command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int count = 1; // Initialize the counter variable to 1
        while (count <= 100) { // Loop until the counter reaches 100
            System.out.println(count); // Print the current value of the counter
            count++; // Increment the counter by 1
        }
    }
}

