package MethodsFunctions;

import java.util.*;
public class ElementFinding {
    
    boolean linearSearch(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return true;
        }
        return false;
    }

    boolean binarySearch(int []arr, int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target)
                return true;
            if(target > arr[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;

    }

    public static void main(String[] args) {
        ElementFinding m = new ElementFinding();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean search = m.binarySearch(arr, target);
        System.out.println(search?"Element Found":"Not Found");
    }
}
