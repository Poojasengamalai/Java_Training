package Arrays;
import java.util.*;
public class Difference {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int oddsum = 0;
        int evensum = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==1){ //this is for odd element sum and i%2==1 is for odd place element sum
                oddsum+=arr[i];
            }else{
                evensum+=arr[i];
            }
        }
        int diff = evensum-oddsum;
        System.out.println(diff);
        sc.close();
    }
}