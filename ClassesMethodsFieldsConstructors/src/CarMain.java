public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Camry", "Black", 200);
        System.out.println(Car.NO_OF_WHEELS);
        //Car.noOfWheels = 6;
        // you can change static variables if not made constant
        System.out.println(Car.NO_OF_WHEELS);
    }
}
