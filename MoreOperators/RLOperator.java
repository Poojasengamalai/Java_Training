package MoreOperators;

public class RLOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Relational Operators
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));
        System.out.println("!y     : " + (!y));

        int c = 5;

        // Relational + Logical Operators Together
        System.out.println("(a > b) && (b > c) : " + ((a > b) && (b > c)));
        System.out.println("(a < b) || (b > c) : " + ((a < b) || (b > c)));
        System.out.println("!(a == b) : " + (!(a == b)));
        System.out.println("(a >= b) && (c <= b) : " + ((a >= b) && (c <= b)));
        System.out.println("(a != c) || (b < c) : " + ((a != c) || (b < c)));
    }
}