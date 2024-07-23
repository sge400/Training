public class Employee {

    //fields
    String firstName;
    String lastName;
    byte age;
    char gender;

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
