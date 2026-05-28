package TwoDArray;

import java.util.*;
public class MaxofRows {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max = sum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
