package Tests;

import java.util.Scanner;
public class ShortestAmg3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println("Car 1 goes into road A");
        }else if (b<a && b<c){
            System.out.println("Car 1 goes into road B");
        }else if(c<a && c<b){
            System.out.println("Car 1 goes into road C");
        }else{
            System.out.println("No path exists");
        }
        sc.close();
    }
    
}
