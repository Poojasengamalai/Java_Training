package PatternConcept;

import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){          //for rows
            for(int j=1;j<=num;j++){      //for colums and after splitting triangle it both are equal then j<=n if a column is reduced then j<=n-1
                if((i+j)>=(num+1)){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int k=1;k<=i;k++){      //for mirror triangle at a time or else for reducing one column in the end then k<i
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        }
    }

