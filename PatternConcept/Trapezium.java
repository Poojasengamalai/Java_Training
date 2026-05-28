package PatternConcept;

import java.util.Scanner;
public class Trapezium {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left = 1;
        int right = (n*n)+1;
        for(int i = 1;i<=n;i++){
            for(int j=1; j<=n; j++){
                if(j>=i)
                    System.out.print(left++ + "*");
                else
                    System.out.print("-");
            }  
            for(int k=1; k<n; k++){
                if(i+k<n+1)
                    System.out.print(right++ + "*");
            }
            System.out.print(right);
            right = right - (2*(n-i));
            System.out.println();
        }
        sc.close();
    }
}
