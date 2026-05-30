package OOPs;

class Car{
    String brand_name;
    int model_no;
    
    // by using reference variables
    void setValue(String b, int m){
        brand_name = b;
        model_no = m;
    }

    // by using method
    void printValue(){
        System.out.println(brand_name+" "+model_no);
    }

    Car(){
        System.out.println("Hiiiii");
    }

    // by using constructors
    Car(String brand, int model){
       brand_name = brand;
       model_no = model;
    }
}


public class InitializeObj{
    public static void main (String[] args) {
        
        Car c1 = new Car();
        c1.brand_name = "BMW";
        c1.model_no = 1002;
        System.out.println(c1.brand_name+" "+c1.model_no);
        
        Car c2 = new Car();
        c2.setValue("Tesla", 3002);
        c2.printValue();
        
        Car c3 = new Car("Honda", 2003);
        c3.printValue();
    }
}