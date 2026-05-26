package ControlflowStmt;

import java.util.Scanner;
public class TypeofTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( (a+b)>c && (a+c)>b && (b+c)>a){
            if( a==b && a==c){
                System.out.println("Equivaletral");
            }else if( a==b || a==c || b==c){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }
        else{
        System.out.println("Not a Triangle");
        }
        sc.close();
    }
}
