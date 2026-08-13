package Tests;
import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            long fact = 1;
            for (int j = 1; j <= n; j++) {
                fact *= j;
            }
            sum += fact;
        }
        if (sum == Long.parseLong(s))
            System.out.println("Right");
        else
            System.out.println("Wrong");
    }
}