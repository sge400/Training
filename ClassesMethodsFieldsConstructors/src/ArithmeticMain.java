public class ArithmeticMain {

    public static void main(String[] args) {
       int result = ArithmeticOperations.addition(20, 4);
        System.out.println(result);
        System.out.println(ArithmeticOperations.PI_VALUE);

        //invoke instance methods
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        int resultInstanceMethod = arithmeticOperations.sum(20,5);
        System.out.println(resultInstanceMethod);
        System.out.println(arithmeticOperations.piValue);
    }
}


