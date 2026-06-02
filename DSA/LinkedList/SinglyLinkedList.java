package DSA.LinkedList;

// Structure of the Node
class Node{
    int data;
    Node next;
}

// Singlly linked list
class SLL{
    Node head;

    // while creating node head should be null
    SLL(){
        head = null;
    }


    void insertAtEnd(int val){    //insert at end or last
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAtBegin(int val){     //insert at begining or first
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int val, int pos){  // insert at position
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node temp = head;
            for(int i=1;i<pos-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }


    void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtMiddle(int val){  // insert at position
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        if(head == null){
            head = newNode;
        }else{
            Node slow = head;
            Node fast = head;
            Node prev = null;
            while(fast != null && fast.next != null){   // this for middle and this is for after middle (fast.next != null && fast.next.next != null)
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow;
            prev.next = newNode;
        }

        // Node temp = head;
        // int count = 0;
        // while(temp!=null){
        //     count++;
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i=1;i<(count/2);i++){  // this is for insert at middle for even number of elements only
        //     temp = temp.next;
        // }
        // newNode.next = temp.next;
        // temp.next = newNode;

        
    }

}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL s1 = new SLL();

        // Initial values
        s1.insertAtEnd(100);
        s1.insertAtEnd(200);
        s1.insertAtEnd(50);
        s1.insertAtEnd(75);

        System.out.println("Original List: ");
        s1.display();

        // Insert at beginning
        s1.insertAtBegin(90);
        System.out.println("Insert at Begining: ");
        s1.display();

        // Insert at end
        s1.insertAtEnd(80);
        System.out.println("Insert at End: ");
        s1.display();

        // Insert 30 at position 3
        s1.insertAtPosition(30, 3);
        System.out.println("Insert at Position: ");
        s1.display();

        System.out.print("After Insertions: ");
        s1.display();

        // Insert 55 at middle
        s1.insertAtMiddle(55);
        System.out.println("Insert at Middle: ");
        s1.display();
    }
    
}
