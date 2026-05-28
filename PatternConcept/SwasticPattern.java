package PatternConcept;

import java.util.Scanner;

public class SwasticPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n/2+1;
        if(n%2==1){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n;j++){
                if((i<=m)&&(j==1) || (i==1)&&(j>=m) || (i==m) || (j==m) || (i==n)&&(j<=m) || (j==n)&&(i>=m)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }else{
        System.out.println("Enter odd number");
    }
        sc.close();
    }
    
}

