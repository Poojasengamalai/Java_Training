package OOPs;

abstract class Shapes{
    // abstract class with abstract method

    // Abstract method. It tells what to do 
    // can create square wiht anything either pen or pencil or sketch..
    abstract void square(); 
}

class pencil extends Shapes{
    void square(){
        System.out.println("Square created using pencil..");
    }
}

class sketch extends Shapes{
    void square(){
        System.out.println("Square created using sketch..");
    }
}

abstract class Music{
    // abstract class with abstract method

    // can be play with anything phone, lap, bluetooth, etc but you need to play music
    abstract void play();   // what to do 
    abstract void stop();

    // abstract class with concrete method
    void pause(){            //how to do 
        System.out.println("Music Paused!!!!!!");
    }
}

class MobilePhone extends Music{
    void play(){
        System.out.println("Music plays in mobile...");
    }
    void stop(){
        System.out.println("Music Stops..");
    }
}

class Laptop extends Music{
    void play(){
        System.out.println("Music plays in laptop");
    }
    void stop(){
        System.out.println("Music Stops..");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.play();
        Laptop l = new Laptop();
        l.play();
        l.stop();

    }
}
