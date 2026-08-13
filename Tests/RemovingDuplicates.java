package Tests;
import java.util.*;
public class RemovingDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            boolean found = false;
            for(int j = 0; j < sb.length(); j++){
                if(sb.charAt(j) == ch){
                    found = true;
                    break;
                }
            }
            if(found == false){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
