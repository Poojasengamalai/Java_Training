package Collections.Lists_;

import java.util.LinkedList;

public class WC_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(90);
        list.add(60);
        System.out.println(list);

        list.add(1,77);
        System.out.println(list);

        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);

        LinkedList<String> h = new LinkedList<>();
        h.add("Hello");
        h.add("Hat");
        h.add("Bat");
        h.add("Ball");
        System.out.println(h);

        h.remove("Hat");
        System.out.println(h);

        h.addFirst("Happy");
        h.addLast("Honey");
        System.out.println(h);

        h.removeFirst();
        h.removeLast();
        System.out.println(h);
    }
}
