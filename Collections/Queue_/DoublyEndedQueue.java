package Collections.Queue_;

import java.util.*;

public class DoublyEndedQueue{
    public static void main(String[] args) {
            // Deque -> Doubly Ended Queue
            // Insertion and deletion can be done at both ends
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);   //queue methods
        dq.offer(20);
        // deque methods
        dq.offerLast(30);
        dq.addLast(70);
        System.out.println(dq);

        // deque methods
        dq.offerFirst(60);
        dq.addFirst(80);
        System.out.println(dq);

        dq.remove();  //queue methods removes first element or front element 
        // deque methods
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        dq.addFirst(77);
        dq.offerLast(88);
        dq.add(17);
        System.out.println(dq);

        dq.poll();  // queue method
        // deque methods
        dq.pollFirst();
        dq.pollLast();

        dq.push(45);
        dq.push(97);
        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peekFirst());
    }
}
