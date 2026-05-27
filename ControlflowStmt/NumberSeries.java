package ControlflowStmt;

import java.util.Scanner;
public class NumberSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n;i++){
            if(i%2==1){
                // int odd = (i*i)-1;
                System.out.print(((i*i)-1)+" ");
            }else{
                // int even = (i*i)-2;
                System.out.print(((i*i)-2)+" ");
            }
        }
        sc.close();
    }
}
