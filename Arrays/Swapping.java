package Arrays;

import java.util.*;
public class Swapping {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            // System.out.print(arr[i]+" ");
        }
        // 10 20 30 40 50 60
        //  0  1  2  3  4  5
        for(int i = 0; i<n-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        System.out.print(Arrays.toString(arr));
        sc.close();
    }
}
