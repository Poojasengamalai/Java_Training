package Strings;

import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub_seq = sc.nextLine();
        if(str.length() < sub_seq.length()){
            System.out.print("0");
        }else{
            int i=0,j=0;
            while(i<str.length()){
                if(str.charAt(i)== sub_seq.charAt(j)){
                    i++;
                    j++;
                }else
                    i++;
                if(j==sub_seq.length()){
                System.out.println("1");
                return;
                }
            }
        }
        System.out.print("0");
        sc.close();
    }
}
