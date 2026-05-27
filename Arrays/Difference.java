package Arrays;
import java.util.*;
public class Difference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            // System.out.print(arr[i]+" ");
        }
        int oddsum = 0;
        int evensum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==1){
                oddsum+=arr[i];
            }else{
                evensum+=arr[i];
            }
        }
        int diff = evensum-oddsum;
        System.out.println(diff);
        
        // System.out.print(Arrays.toString(diff));
        sc.close();
    }
}