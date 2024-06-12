package Cgpa;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Cgpa_Calculator {

    public static void main(String[] args) {
        System.out.println("This is CGPA Calculator");
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter number of semesters:");
            int n = sc.nextInt();
            
            if (n > 0) {
                float[] f = new float[n];
                float sem;
                float sum = 0;

                for (int i = 0; i < n; i++) {
                    System.out.println("Enter your " + (i + 1) + " Semester GPA:");
                    f[i] = sc.nextFloat();
                }

                for (int i = 0; i < n; i++) {
                    sum += f[i];
                }

                sem = sum / n;
                
                System.out.println("Enter mode: 1 - CGPA , 2 - Percentage");
                int options = sc.nextInt();

                if (options == 1) {
                    System.out.println("Your CGPA scale out of 10 is " + sem);
                } else if (options == 2) {
                    float percentage = sem * 9.5f;
                    System.out.println("Your Percentage scale out of 100 is " + percentage);
                } else {
                    System.out.println("Invalid option selected.");
                }
            } else {
                System.out.println("Number of semesters should be greater than 0.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

