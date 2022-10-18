package JavaKamp2Odev.Inheritance;

public class Main {
    public static void main(String[] args) {
    Customer customer=new Customer();
    Employee employee=new Employee();
    //so this way we set up basic Inheritance here
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        employeeManager.BestEmployee();
        customerManager.List();
    }
}
