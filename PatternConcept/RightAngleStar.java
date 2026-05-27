package PatternConcept;

import java.util.Scanner;
public class RightAngleStar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*another method 
in inner for loop
for(j=1;j<=n;j++){
    if(j<=i){
        Sop{"* "}
    }
} */