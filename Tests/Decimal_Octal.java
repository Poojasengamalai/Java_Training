package Tests;

import java.util.Scanner;
public class Decimal_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        String oct = "";
        int rem = 0;
        while(temp>0){
            rem = temp % 8;
            oct = rem + oct;
            temp = temp / 8;
        }
        System.out.println(oct);
        sc.close();
    }
}
