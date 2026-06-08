package Tests;

import java.util.Scanner;
public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []arr = str.toCharArray();
        StringBuilder sb = new StringBuilder(str);
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            char ch1 = sb.charAt(left);
            char ch2 = sb.charAt(right);
            if(!Character.isLetter(ch1)){
                left++;
            }else if(!Character.isLetter(ch2)){
                right--;
            }else{
                sb.setCharAt(left, ch2);
                sb.setCharAt(right, ch1);
                left++;
                right--;
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
