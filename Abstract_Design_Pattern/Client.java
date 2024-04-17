package Abstract_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        // I want to get get android Developer
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();
    }
}
