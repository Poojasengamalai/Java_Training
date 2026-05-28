package TwoDArray;

import java.util.*;
public class DiffofDiagonal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int left =0;
        int right = 0;
        for(int i =0;i<n;i++){
            left+=arr[i][i];
            right+=arr[i][n-i-1];
        }
        System.out.println((left>right) ? left-right : right-left);
        sc.close();
    }
}
