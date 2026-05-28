package Strings;

import java.util.*;
public class OnlineGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        String game = "";
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                game = game + arr[i]+" ";
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                game = game + arr[i]+" ";
            }
        }
        System.out.println("Array After Segregation");
        System.out.println(game);
        sc.close();
    }    
}
