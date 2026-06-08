package Tests;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String temp = "";
        for(int i=str.length()-1;i>=0;i--){
            temp += str.charAt(i);
        }
        if(str.equals(temp)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
