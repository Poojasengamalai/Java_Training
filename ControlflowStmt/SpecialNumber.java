package ControlflowStmt;

import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i <= n; i++)
        {
            int num = i;
            int sum = 0;
            int product = 1;
            while(num > 0)
            {
                int d = num % 10;
                sum = sum + d;
                product = product * d;
                num = num / 10;
            }
            if(sum + product == i)
            {
                System.out.println(i);
            }
        }
        sc.close();
    }
}