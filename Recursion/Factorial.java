package Recursion;

import java.util.*;
public class Factorial {
    static int fact(int n){
        if(n==0 || n==1) return 1;
        int a = n*fact(n-1);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = fact(a);
        System.out.println(result);
    }
}
