package PatternConcept;

import java.util.Scanner;
public class NumberPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int a = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j +" "); // print j then same numbers in columns, print i then same number in rows 
            }
            System.out.println();
        }
        sc.close();
    }
}
