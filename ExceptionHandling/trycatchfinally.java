package ExceptionHandling;

import java.util.*;
public class trycatchfinally {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();  //12.5
            System.out.println(num);
        }
        catch(Exception e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
        finally{
            System.out.println("Hiiii...Exception");
        }
        System.out.println("End of the program");
    }
}
