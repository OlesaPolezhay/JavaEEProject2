public class Main {
    public static void main(String[] args) throws EmployeeInRegistyExseption {

        Employee emp = null;
        emp = new Employee("Steve Jobs");
            //emp.printEmployee();
        Registry hr = Registry.getInstance();
        try {
            hr.addWorker(emp);
            //hr.toStringList();
        }catch (EmployeeInRegistyExseption ex){
            System.out.println(ex.getMessage());
        }

        Manager emp1 = null;
        emp1 = new Manager("Robert Martin", 1200);
        try {
            hr.addWorker(emp1);
          //  hr.toStringList();
        }catch (EmployeeInRegistyExseption ex){
            System.out.println(ex.getMessage());
        }

        Employee emp2 = null;
        emp2 = new Employee("Ward Cunningham");
        //emp2.printEmployee();
        try {
            hr.addWorker(emp2);
           // hr.toStringList();
        }catch (EmployeeInRegistyExseption ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("\nList of employees");
        hr.toStringList();
    }
}
