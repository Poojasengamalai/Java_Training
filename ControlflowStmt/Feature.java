package ControlflowStmt;

import java.util.*;
public class Feature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0 && a<=7){
            boolean canRead = (a & 1) != 0;
            boolean canWrite = (a & 2) != 0;
            boolean canExecute = (a & 4) != 0;
            
            System.out.println("Can Read: "+ canRead);
            System.out.println("Can Write: "+ canWrite);
            System.out.println("Can Execute: "+ canExecute);
        }
        else{
            System.out.println("Invalid input... Enter number from 0-7");
        }
        sc.close();
    }
  
}
