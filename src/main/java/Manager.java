public class Manager extends Employee {
    double bonus;

    public Manager(String name, double bonus){
        this.ID = nextID++;
        this.name = name;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void PrintEmployee(){
        System.out.println("ID:" + ID +  " Name: " + name + " Bonus: " + bonus) ;
    }
}
