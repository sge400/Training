public class CarMain {

    static {
        System.out.println("static block from the same class");
//        System.exit(0); //terminate program gracefully
//        System.exit(-1); //terminate program due to some error

    }

    public static void main(String[] args) {
        System.out.println("Main methood invocation started");
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);
        System.out.println(Car.NO_OF_WHEELS);
        //Car.noOfWheels = 6;
        // you can change static variables if not made constant
        System.out.println(Car.noOfEngines);
    }
}
