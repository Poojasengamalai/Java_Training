package OOPs;

class Car{
    String name;
    int id;

    // Non-Parameterized Constructor
    Car(){
        System.out.println("Hi...Good Afternoon !!!");
    }

    //Parameterized Constructor
    Car(String brand, int age){ 
       System.out.println("Hi, "+brand+" age is "+age);
    }

    //copy constructor
    Car(int i, String n){
        name = n;
        id = i;
    }
    
    Car( Car c){
        name = c.name;
        id = c.id;
    }
}


public class Constructors{ 
    public static void main (String[] args) {
       Car c1 = new Car();
       Car c2 = new Car("Avis", 25);
       Car c3  = new Car(3004,"Thar");
       Car c4 = new Car(c3);
       System.out.println("Car c3 : "+c3.name+" "+c3.id);
       System.out.println("Car c4 : "+c4.name+" "+c4.id);
       
    }
}