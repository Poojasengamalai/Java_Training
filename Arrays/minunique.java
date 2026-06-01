package Arrays;

import java.util.*;
public class minunique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count[] = new int[127];
        for(int i=0;i<n;i++){
            count[arr[i]-0]++;
        }
        for(int i=0;i<n;i++){
            if(count[i]==1){
                System.out.println(i);
                break;
            }
        }
    sc.close();
    }
}
