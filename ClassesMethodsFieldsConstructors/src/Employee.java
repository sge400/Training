public class Employee {

    //fields
    String firstName;
    String lastName;
    byte age;
    char gender;
    static final String EMPLOYER_NAME = "Google";

    //constructor chaining
    public Employee() {
        this("Jason", "Momoa", (byte) 42, 'm');
        System.out.println("Object is getting created in default constructor...");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Object is getting created in overloaded constructor...");
    }

    //methods
    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getName() {
        String name = firstName + " " + lastName;
        return name;
    }
}
