package Tests;

import java.util.Scanner;
public class Eligibility {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int reg = sc.nextInt();
        float cgpa = sc.nextFloat();
        int arr = sc.nextInt();
        System.out.println(name);
        System.out.println(reg);
        if(arr == 0 && cgpa>=7.0){
            System.out.println("Eligible to attend placement");
        }else if(arr <= 2 && cgpa>=7.5){
            System.out.println("Eligible to attend placement");
        }else{
            System.out.println("Not Eligible to attend placement");
        }
        sc.close();
    }
}
