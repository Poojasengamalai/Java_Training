package DSA.Stack;

class stackArray{
    int []stack;
    int top;
    
    stackArray(int size){
        stack = new int[size];
        top = -1;
    }

    void push(int data){
        if(top == stack.length-1){
            System.out.println("Stack Overflow!!");
        }else{
            stack[++top] = data;
            // System.out.println("Element pushed successfully at "+ top);
        }
    }

    // int pop(){
    //     if(top == -1){
    //         System.out.println("Stack Underflow");
    //         return -1;
    //     }else{
    //          int popped = stack[top];
    //          top--;
    //          return popped;
    //     }
    // }

    // this is for removing single element form the stack
    void pop(){
        if(top ==-1){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("Popped Element: "+ stack[top]);
            top--;
        }
    }

    int peek(){
        return stack[top];
    }

    // void peek(){
    //     System.out.println("Peek element: "+stack[top]);
    // }

    void display(){
        if(top == -1){
            System.out.println("Stack is Empty..!!");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }

}

public class StackUsingArray {
    public static void main(String[] args) {
        stackArray st = new stackArray(5);
        st.push(60);
        st.push(61);
        st.push(62);
        st.push(63);
        st.push(64);
        st.push(65);

        System.out.println("Stack Elements..");
        st.display();

        int peek = st.peek();
        System.out.println("Peek Element is: "+peek);

        // this is for removing single element form the stack 
        System.out.println("After Pop");
        st.pop();
        
        // for removing all element from the stack 
        while(st.top != -1){
            st.pop();
        }

        st.display();
    }
    
}
