package Collections.Lists_;

import java.util.Vector;

public class WC_Vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(2);
        System.out.println("Initial Capacity: "+ v.capacity());
        v.add(25);
        v.add(65);
        System.out.println("After adding 2 capacity: "+v.capacity());
        v.add(45);
        v.add(89);
        v.add(23);
        v.add(77);
        System.out.println("Final Capacity: "+v.capacity());

    }
}
