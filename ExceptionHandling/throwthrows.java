package ExceptionHandling;



class MkceException extends Exception{
    MkceException(){
        super("Don't Sleep");
    }
}

public class throwthrows {

    static boolean validateAge(int age) throws MkceException{
        if(age>20){
            return true;
        }else{
            throw new MkceException();
        }
    }
    public static void main(String[] args) throws MkceException{
        try{
            validateAge(12);
        }catch(MkceException e){
            System.out.println(e);
        }


        // throw Exception
        // if(14<18){
        //     throw new ArrayIndexOutOfBoundsException();
        // }
        // System.out.println("Hello..!!");
    }
}
