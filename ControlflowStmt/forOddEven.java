package ControlflowStmt;

public class forOddEven {
    public static void main(String args[]){
        for(int i = 1; i<=10; ){
            if((i&1)==0){    //this is for even and for odd (i&1)==1
                System.out.println("Hello "+ i);
                i+=2;
            }
            else{
                System.out.println("Java "+i);
                i+=3;
            }
        }
    }
}
