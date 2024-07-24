public class Car {

    //instance fields, nonstatic fields
    String model;
    String color;
    int horsePower;

    //constant static fields, constant static variables
    static final byte NO_OF_WHEELS = 4;

    //instance initialization block
    {
//        this.model = "Camry";
//        this.color = "Black";
//        this.horsePower = 200;


        System.out.println("Car object is being created...");
    }

    //default constructor
    public Car(){
    }

    //overloaded constructor
    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    //method(s)
    static void startCar() {
        System.out.println("Vehicle started...");
    }

    public String stopCar() {
        String output = "Vehicle stopped...";
        return output;
    }
}
