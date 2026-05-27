package Arrays;

public class Basic {
    public static void main(String args[]){
        int []arr = new int[0];
        System.out.print(arr);  // gives allocated memory
        // System.out.print(arr[]); //may occur array index out of bound exception like without index values
        int []arr1 = {1,3,5,7};
        System.out.println(arr1[3]);
    }
}
