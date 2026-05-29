package MethodsFunctions;

import java.util.*;

public class Methods {

    // with return type with parameter
    int add(int a, int b){ 
        int c = a+b;
        return c;
    }

    // with return type without parameter
    boolean isPrime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n[isPrime] Enter a number to check: ");
        int number = sc.nextInt();
        int count = 0;
        
        System.out.print("[isPrime] Factors found: ");
        for(int i=1; i<=number; i++){
            if(number%i==0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println(); // New line after printing factors
        return count == 2;  //if count == 2 prime otherwise not
    }

    // without return type with parameter
    void sort(int []array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // without return type without parameter
    void duplicateMain()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n[duplicateMain] Enter a number to add to 76: ");
        
        int num = sc.nextInt();
        int c = add(num, 76);
        System.out.println("[duplicateMain] Hello, your calculation result is: " + c);
    }

    //if we need to access the non-static 
    public static void main(String[] args) {
        Methods m = new Methods(); // if static is not mentioned before the return type of the above methods then need to create object

        // 1. Testing add()
        int result = m.add(10, 20); 
        System.out.println("--- 1. Testing add(10, 20) ---");
        System.out.println("Result: " + result);
        System.out.println();

        // 2. Testing sort()
        int nums[] = {1, 5, 3, 7, 9, 4};
        System.out.println("--- 2. Testing sort() ---");
        System.out.print("Sorted Array: ");
        m.sort(nums);
        for(int e : nums){
            System.out.print(e + " ");
        }
        System.out.println("\n");

        // 3. Testing isPrime() 
        System.out.println("--- 3. Testing isPrime() ---");
        boolean primeResult = m.isPrime();
        System.out.println("[isPrime] Is it a prime number? -> " + primeResult);

        // 4. Testing duplicateMain()
        System.out.println("\n--- 4. Testing duplicateMain() ---");
        m.duplicateMain();
    }   
}
