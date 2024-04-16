public class DeveloperClient {

    public static void main(String[] args){
        // Employee employee = new AndroidDeveloper();  // -> This is not correct as this is tightly coupled
                                                        // -> So will be using Factory Design Pattern
        
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        employee.salary();
    }

}