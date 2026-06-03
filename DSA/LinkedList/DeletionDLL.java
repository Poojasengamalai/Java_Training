package DSA.LinkedList;

class DNoded{
    int data;
    DNoded next;
    DNoded prev;
}

class DLLdelete{
    DNoded head;

    DLLdelete(){
        head = null; 
    }


    void insertAtEnd(int val){
        DNoded newNode = new DNoded();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;

        if(head == null){
            head = newNode;
        }else{
            DNoded temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteAtEnd(){
        DNoded temp = head;
        DNoded prev = null;
        if(head == null){
            System.out.println("List is Empty");
        }
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        temp.prev = null;
    }

    void deleteAtBegining(){
        DNoded temp = head;
        head = head.next;
        temp.next.prev = null;
        temp.next = null;
    }

    void deleteAtPosition(int pos){
        DNoded temp = head;
        DNoded prev = null;
        for(int i=1;i<=pos-1;i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next.prev = prev;
        temp.next = null;
        temp.prev = null;
    } 

    void forwardTraversal(){
        DNoded temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class DeletionDLL {
    public static void main(String[] args) {
        DLLdelete d = new DLLdelete();
        d.insertAtEnd(20);
        d.insertAtEnd(15);
        d.insertAtEnd(45);
        d.insertAtEnd(50);
        d.insertAtEnd(10);
        d.insertAtEnd(12);
        d.insertAtEnd(89);

        System.out.println("Original List is: ");
        d.forwardTraversal();

        System.out.println("Delete at end: ");
        d.deleteAtEnd();
        d.forwardTraversal();

        System.out.println("Delete at begining: ");
        d.deleteAtBegining();
        d.forwardTraversal();

        System.out.println("Delete at Position 3: ");
        d.deleteAtPosition(3);
        d.forwardTraversal();
    }
    
}
