package MoreOperators;
public class BitwiseOperator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Bitwise AND
        System.out.println("Bitwise AND (a & b)  = " + (a & b));

        // Bitwise OR
        System.out.println("Bitwise OR (a | b)   = " + (a | b));

        // Bitwise XOR
        System.out.println("Bitwise XOR (a ^ b)  = " + (a ^ b));

        // Bitwise Complement(tilte ~)
        System.out.println("Bitwise NOT (~a)     = " + (~a));

        // Left Shift
        System.out.println("Left Shift (a << 1)  = " + (a << 1));

        // Right Shift
        System.out.println("Right Shift (a >> 1) = " + (a >> 1));
    }
}