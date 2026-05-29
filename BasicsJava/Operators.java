public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 20;
        int b = 10;

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulo = " + (a % b));

        // Increment Operator
        int x = 5;
        System.out.println("Original x = " + x);
        System.out.println("Post Increment x++ = " + (x++));
        System.out.println("After Increment x = " + x);

        // Decrement Operator
        int y = 8;
        System.out.println("Original y = " + y);
        System.out.println("Post Decrement y-- = " + (y--));
        System.out.println("After Decrement y = " + y);

        // Expression using increment and decrement
        int d = 6;
        int e = 8;
        int f = 4;

        int r = d++ + --d + e-- / --f;

        System.out.println("Value of r = " + r);
        System.out.println("Final value of d = " + d);
        System.out.println("Final value of e = " + e);
        System.out.println("Final value of f = " + f);
    }
}