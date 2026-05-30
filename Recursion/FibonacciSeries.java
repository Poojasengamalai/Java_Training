package Recursion;

import java.util.*;
public class FibonacciSeries {
    static int fib(int n){
        if(n==1) return 0;
        if(n==2) return 1;
        int c = fib(n-1) + fib(n-2);
        return c;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println(result);
        
        // for(int i=0; i<=n; i++){
        //     System.out.print(fib(i)+" ");
        // }
        
        // int a =0;
        // int b =1;
        // int c;
        // for (int i = 0;i<n; i++){
        //     System.out.print(a+" ");
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }
    }
}
