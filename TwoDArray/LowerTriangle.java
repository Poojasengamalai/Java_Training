package TwoDArray;

import java.util.*;
public class LowerTriangle {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];


        boolean chk = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
            
        }  
            for(int i=0;i<n;i++){
                for(int j=0;j<i;j++){
                    if(i < j && arr[i][j] != 0){
                        chk = false;
                        break;
                    }
                }
            }
        if(chk){
            System.out.println("Lower Triangular Matrix");
        }
        else{
            System.out.println("Not a Lower Triangular Matrix");

        }
        sc.close();
    }
}