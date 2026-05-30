package OOPs;

// Method Overloading
class calculator{

    // Based on parameters
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    // Based on Datatype
    void add(String name, int age){
        System.out.println("Details Added Successfully...");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}

// Method Overriding
class Animal{
    void sound(){
        System.out.println("Hellow Animals");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dod bark bark");
    }
}

public class Polymorphism{
    public static void main(String[] args) {

    // Method Overloading
        calculator c = new calculator();
        System.out.println("Two params : "+ c.add(10,20));
        System.out.println("Three params : "+ c.add(10,20,30));
        c.add("Pooja",20);

    // Method Overriding
        Dog d = new Dog();
        d.sound();

    }

}