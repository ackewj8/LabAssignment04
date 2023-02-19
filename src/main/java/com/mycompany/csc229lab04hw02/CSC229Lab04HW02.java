/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04hw02;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link:https://github.com/ackewj8/LabAssignment04.git
 */
public class CSC229Lab04HW02 {
    public static void multiple(int n1, int n2) { // multiple function
        int sum = 0; // Sum of multiples of 7
        for(int i = n1; i <= n2; i++) {
            if (i % 7 == 0) { // If i is a multiple of 7
                System.out.println(i);
                // Adds i's value to the sum if it is a multiple of 7
                sum = sum + i;
            }
        }
        System.out.println(sum); // Printing the sum
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n1; // The starting value for multiple
        int n2; // The ending value for multiple
        // User inputs n1's value
        System.out.println("Please input the first number: ");
        n1 = scnr.nextInt(); // Assigning the value of n1 the user's input
        // User inputs n2's value
        System.out.println("Please input the second number (Higher than the first one): ");
        n2 = scnr.nextInt(); // Assigning the value of n2 the user's input
        System.out.println("Now implementing function...");
        multiple(n1, n2); // Calling the multiple function
    }
}
