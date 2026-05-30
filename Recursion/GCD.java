package Recursion;

import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        for(int i=1;i<=b;i++){
            if(b%i==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nGCD: "+gcd(a,b));
        
    }
}
