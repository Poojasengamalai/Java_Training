package Strings;

import java.util.*;
public class ReversingOfWords {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        sc.close();
    } 
}



// for(int i=0;i<length/2;i++){
//     String temp = words[i];
//     words[i] = words[length - i -1];
//     sords[length - i - 1] = temp;
// }
// for(String word : words){
//     System.out.print(word + " ");
// }
