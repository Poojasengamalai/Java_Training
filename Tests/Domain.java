package Tests;

import java.util.Scanner;
public class Domain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String domain = email.split("@")[1];
        System.out.println(domain);
        sc.close();
    }
    
}
