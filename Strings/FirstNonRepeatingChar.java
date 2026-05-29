package Strings;

import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count[] = new int[26];
        for(int i=0; i<str.length();i++){
            count[str.charAt(i) - 97]++;
        }

        // for(int i=0; i<count.length; i++){
        //     System.out.println("Charater " +(char)(i+97)+ " count: "+count[i]);
        // }

        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i) - 97]==1){
                System.out.print(str.charAt(i));
                break;
            }
        }

        // for(int i=0; i<count.length; i++){
        //     if(count[str.charAt(i) - 'a']==1){
        //         System.out.print(str.charAt(i));
        //     }
        // }
        sc.close();
    }
}
