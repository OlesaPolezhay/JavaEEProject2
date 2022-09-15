public class Employee {
    protected String name;
    protected String departmentname;
    protected double salary;
    protected int ID;
    protected int managerID;
    protected static int nextID = 0;

    public Employee(String name){
        this.name = name;
        this.ID = nextID++;
    }

    public Employee(){

    }
    public String getDepartmentname() {
        return departmentname;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void printEmployee() {
        System.out.println(toString()) ;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                " name='" + name + '\'' ;
    }
}

