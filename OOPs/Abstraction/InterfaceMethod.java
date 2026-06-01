package OOPs.Abstraction;

interface Shape{
    void circle();
    void triangle();

    // static, default, private for create or define method inside interface
    static void square(){
        System.out.println("Square static");
    }

}
class pen implements Shape{
    public void circle(){
        System.out.println("Circle is drawn using pen");
    }
    public void triangle(){
        System.out.println("Triangle is drawn using triangle");
    }
}
public class InterfaceMethod {
    public static void main(String[] args) {
        pen p = new pen();
        p.circle();
        p.triangle();
        // to access the method inside interface class
        Shape.square();
    }
}
