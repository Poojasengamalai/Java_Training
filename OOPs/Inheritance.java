package OOPs;

//Parent class
class Mobile{
    void communicate(){
        System.out.println("    Communication using Mobile...");
    }
}

// Single Inheritance  (Nokia extends Mobile)
// Child class
class Nokia extends Mobile{
    void game(){
        System.out.println("    Snake game...");
    }
}

// Multilevel Inheritance
// Grandchild class
class Samsung extends Nokia{
    void camera(){
        System.out.println("    Camera memories...");
    }
}

// Heirachical Inheritance
class Readmi extends Nokia{
    void audio(){
        System.out.println("    Music can be played...");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // Single Inheritance
        Nokia n = new Nokia();
        System.out.println("Single Inheritance");
        n.game();
        n.communicate();

        // Multilevel Inheritance
        Samsung s = new Samsung();
        System.out.println("Multilevel Inheritance");
        s.communicate();
        s.camera();
        s.game();

        // Heirarchical Inheritance
        Readmi r = new Readmi();
        System.out.println("Heirachical Inheritance");
        r.communicate();
        r.audio();
        r.game();
    }    
}
