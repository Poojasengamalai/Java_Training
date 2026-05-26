package ControlflowStmt;

import java.util.Scanner;

public class ConditionalStmt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Inputs
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        System.out.println("Enter Attendance Percentage:");
        int attendance = sc.nextInt();

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        System.out.println("Enter CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("Enter Department Code:");
        System.out.println("1.CSE  2.ECE  3.EEE  4.MECH");
        int dept = sc.nextInt();



        // 1. IF STATEMENT
        System.out.println("\n--- Attendance Status ---");

        if(attendance >= 75)
        {
            System.out.println("Attendance Requirement Satisfied");
        }



        // 2. IF ELSE STATEMENT
        System.out.println("\n--- Result Status ---");

        if(marks >= 50)
        {
            System.out.println("Student Passed");
        }
        else
        {
            System.out.println("Student Failed");
        }



        // 3. ELSE IF LADDER
        System.out.println("\n--- Grade ---");

        if(marks >= 90)
        {
            System.out.println("Grade A");
        }
        else if(marks >= 75)
        {
            System.out.println("Grade B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade C");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }



        // 4. NESTED IF
        System.out.println("\n--- Placement Eligibility ---");

        if(attendance >= 75)
        {
            if(cgpa >= 7.0)
            {
                System.out.println("Eligible for Placement");
            }
            else
            {
                System.out.println("Not Eligible due to Low CGPA");
            }
        }
        else
        {
            System.out.println("Not Eligible due to Low Attendance");
        }



        // 5. SWITCH STATEMENT
        System.out.println("\n--- Department ---");

        switch(dept)
        {
            case 1:
                System.out.println("Computer Science Engineering");
                break;

            case 2:
                System.out.println("Electronics and Communication Engineering");
                break;

            case 3:
                System.out.println("Electrical and Electronics Engineering");
                break;

            case 4:
                System.out.println("Mechanical Engineering");
                break;

            default:
                System.out.println("Invalid Department Code");
        }

        sc.close();
    }
}
