public class EmployeeMain {
    public static void main(String[] args) {
//        Employee = new Employee(); // this was the default constructor

        Employee employee1 = new Employee("John", "Doe", (byte) 29, 'm');
        Employee employee2 = new Employee("Aura", "Lina", (byte) 38, 'f');
        Employee employee3 = new Employee();

//        employee.firstName = "John";
//        employee.lastName = "Doe";
//        employee.age = 29;
//        employee.gender = 'm';

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());
        System.out.println(employee1.getName());
        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());
        System.out.println(employee2.getName());
        System.out.println(employee3.getAge());
        System.out.println(employee3.getGender());
        System.out.println(employee3.getName());

    }
}
