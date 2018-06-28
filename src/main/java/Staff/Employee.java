package Staff;

public abstract class Employee {

    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNin(){
        return this.nin;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double salaryIncrease){
        return this.salary += salaryIncrease;
    }

    public double payBonus(){
        return this.salary / 100;
    }


}
