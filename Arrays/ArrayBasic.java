package Arrays;

import java.util.*;
public class ArrayBasic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){  // i<n or i<=n-1
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
