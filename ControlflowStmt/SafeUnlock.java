package ControlflowStmt;

import java.util.Scanner;

public class SafeUnlock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter a 4 digit number:");
        int num = sc.nextInt();

        // Extract digits
        int first = num / 1000;
        int second = (num / 100) % 10;
        int third = (num / 10) % 10;
        int last = num % 10;

        // Check palindrome
        boolean palindrome = (first == last) && (second == third);

        // Sum of first and last digit
        int sum = first + last;

        // Check even
        boolean evenSum = (sum % 2 == 0);

        // Final condition
        if(palindrome && evenSum)
        {
            System.out.println("Safer Unlocked!!!");
        }
        else
        {
            System.out.println("Try Again!!");
        }
        sc.close();
    }
}