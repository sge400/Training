public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.firstName = "John";
        employee.lastName = "Doe";
        employee.age = 29;
        employee.gender = 'm';

        System.out.println(employee.getAge());
        System.out.println(employee.getGender());
        System.out.println(employee.getName());
    }
}
