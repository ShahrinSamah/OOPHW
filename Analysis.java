/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter4;

/**
 *
 * @author Lenovo S540
 */
import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        
        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes += 1; 
            } else if (result == 2) {
                failures += 1; 
            } else {
                System.out.println("Invalid input. Please enter 1 for pass or 2 for fail.");
                continue; 
            }

            studentCounter += 1; 
        }

       
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
    }
}