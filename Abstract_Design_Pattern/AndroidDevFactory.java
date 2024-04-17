package Abstract_Design_Pattern;

public class AndroidDevFactory extends EmployeeAbstractFactory{

    @Override
    public Employee creatEmployee() {
        return new AndroidDeveloper();
    }
    
}
