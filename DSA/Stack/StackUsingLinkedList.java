package DSA.Stack;

class SNode{
    int data;
    SNode next;
}

class stackLL{
    SNode top;
    
    stackLL(){
        top = null;
    }

    void push(int value){
        SNode newNode = new SNode();
        newNode.data = value;
        newNode.next = null;

        if(top==null)
        {
           top = newNode;
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
    }

    int pop()
    {
        if(top == null){
            return -1;
        }
        SNode temp = top;
        int popped = temp.data;
        top = top.next;
        temp.next = null;

        return popped;
    }

    void peek(){
        System.out.println("Peek Element : " + top.data);
    }
    void display()
    {
        SNode temp = top;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        stackLL st = new stackLL();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

        System.out.println("Popped value : "+st.pop());
        st.display();
        st.peek();

    }
}
