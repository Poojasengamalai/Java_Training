package MoreOperators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User defined values
        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        // Ternary Operator
        int max = (a > b) ? a : b;

        System.out.println("Greater number is = " + max);

        System.out.println((a>b)?"A is greater":"b is greater");

        sc.close();
    }
}