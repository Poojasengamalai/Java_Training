package Map;
import java.util.*;
public class LinkedHash_and_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> details = new TreeMap<>();
        //sort and then print or store (in ascending order)
        details.put(10,"hello");
        details.put(5,"terv");
        details.put(1,"java");
        details.put(7,"mkce");
        
        System.out.println(details);

        LinkedHashMap<Integer, Integer> numbers = new LinkedHashMap<>();
        //prints in same order of the insertion
        numbers.put(12,36);
        numbers.put(1,8);
        System.out.println(numbers);
    }
    
}