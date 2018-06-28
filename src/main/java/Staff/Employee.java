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

//    throw new illegal argument exception?
    public void setName(String name){
        if (name != null) {
            this.name = name;
        }
    }

    public String getNin(){
        return this.nin;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double salaryIncrease){
        if (salaryIncrease < 0) throw new IllegalArgumentException("Cannot increase salary by less than 0");
        return this.salary += salaryIncrease;
    }

    public double payBonus(){
        return this.salary / 100;
    }


}
