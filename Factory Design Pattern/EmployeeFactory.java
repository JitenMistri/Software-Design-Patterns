public class EmployeeFactory {

    // get the Employee
    public static Employee getEmployee(String emp) {
        if(emp.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDeveloper();
        } else if(emp.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        } else {
            retrun null;
        }
    }

}