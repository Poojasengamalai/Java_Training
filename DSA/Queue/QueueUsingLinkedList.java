class QNode
{
    int data;
    QNode next;

    QNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class QueueLL
{
    QNode front, rear;

    QueueLL()
    {
        front = rear = null;
    }
    void enque(int data)
    {
        QNode nn = new QNode(data);
        nn.data = data;
        nn.next = null;

        if(front==null)
        {
            front = rear = nn;
        }
        else
        {
            rear.next = nn;
            rear = nn;
        }
    }

    void display()
    {
        QNode temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    int deque()
    {
        if(front==null) return -1;

        QNode t = front;

        front = front.next;
        t.next = null;

        return t.data;

    }
}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50);

        q.display();

        System.out.println("Dequed  value : " + q.deque());
        q.display();
    }
}