
import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--)
        {
            result.append(arr[i]);
            if(i != 0)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution s = new Solution();
        String result = s.reverseWords(str);
        System.out.println(result);
    }
}
