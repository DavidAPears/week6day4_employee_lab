package Staff.Management;

public class Director extends Manager {

    private int budget;

    public Director(String name, String nin, double salary, String deptName, int budget){
        super(name, nin, salary, deptName);
        this.budget = budget;
    }

    public int getBudget(){
        return this.budget;
    }

}
