package ClassesObjects;


class Car{

    // by using reference variable
    String brand_name;
    int model_no;

    // by using method    
    void setValue(String b, int m){
        brand_name = b;
        model_no = m;
    }

    // for printing
    void printValue(){
        System.out.println(brand_name+" "+model_no);
    }

}

public class BasicCar {
    public static void main(String[] args) {

    // by using reference variable
        Car c1 = new Car();
        c1.brand_name = "Lamborgini";
        c1.model_no = 1710;
        System.out.println(c1.brand_name+" "+c1.model_no);


    // by using method
        Car c2 = new Car();
        c2.setValue("Tesla", 1007);
        c2.printValue();

    }
}
