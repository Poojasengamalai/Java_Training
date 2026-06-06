package Collections.Lists_;

import java.util.*;
public class WC_Stack {
    public static void main(String[] args) {
        Stack<String> mobiles = new Stack<>();

        mobiles.push("Poco");
        mobiles.push("Samsung");
        mobiles.push("Vivo");
        mobiles.push("OnePlus");
        System.out.println(mobiles);

        mobiles.pop();
        System.out.println(mobiles);

        System.out.println(mobiles.peek());

        System.out.println(mobiles.search("Samsung"));  //returns the index of the element 
        System.out.println(mobiles.search("Apple"));   // returns -1 if the element is not present in the list
        
        for(String mobile : mobiles){
            System.out.print(mobile +" ");
        }
        System.out.println();
        for(int i = 0; i<mobiles.size();i++){
            System.out.print(mobiles.get(i)+" ");
        }
    }
}
