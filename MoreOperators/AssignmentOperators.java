package MoreOperators;

public class AssignmentOperators {
    public static void main(String[] args) {

        int a = 10;

        // Assignment Operator
        System.out.println("Initial value of a = " + a);

        // Add and Assign
        a += 5;
        System.out.println("After a += 5 : " + a);

        // Subtract and Assign
        a -= 3;
        System.out.println("After a -= 3 : " + a);

        // Multiply and Assign
        a *= 2;
        System.out.println("After a *= 2 : " + a);

        // Divide and Assign
        a /= 4;
        System.out.println("After a /= 4 : " + a);

        // Modulo and Assign
        a %= 3;
        System.out.println("After a %= 3 : " + a);

        // -----------------------------------------
        // Complex Assignment Expression 1
        // -----------------------------------------

        int p = 10;
        int q = 5;

        p += q *= p;

        System.out.println("\nAfter p += q *= p");
        System.out.println("p = " + p);
        System.out.println("q = " + q);

        // -----------------------------------------
        // Complex Assignment Expression 2
        // -----------------------------------------

        int x = 4;
        int y = 7;
        int z = 2;

        y /= x += z &= y %= 5;

        System.out.println("\nAfter y /= x += z &= y %= 5");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}