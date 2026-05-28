package TwoDArray;

import java.util.*;
public class DiffofDiagonal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int k=0;k<n;k++){
                arr[i][k] = sc.nextInt();
            }
        }
        int left = 0;
        int right = 0;
        for(int i =0;i<n;i++){
            left+=arr[i][i];
            right+=arr[i][n-i-1];
        }
        int diff = 0;
        if(left>right){
            diff = left-right;
            System.out.println(diff);
        }else{
            diff = right-left;
            System.out.println(diff);
        }
        sc.close();
    }
}
