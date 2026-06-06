package Collections.Set_;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>(); 
        hs.add(10);
        hs.add(20);
        hs.add(1);
        hs.add(5);
        hs.add(98);
        hs.add(23);
        hs.add(77);
        System.out.println(hs);

        // hs.remove(20);
        // System.out.println(hs);

        // hs.clear(); 
        // System.out.println(hs);

        System.out.println(hs.contains(1)); //dlt ana apro yethum irukathu so false

        int size = hs.size();
        System.out.println(size);

        Iterator<Integer> iter = hs.iterator();
        //next(), hasNext()

        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
        System.out.println();

        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(5);
        s.add(77);

        System.out.println("Before "+ hs);
        hs.retainAll(s);

        hs.removeAll(s);
        System.out.println("After "+ hs);
    } 
}