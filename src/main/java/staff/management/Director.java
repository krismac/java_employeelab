package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String natInsurance, double salary, String deptName, double budget) {
        super(name, natInsurance, salary, deptName);
        this.budget = budget;
}

    public double getBudget(){
        return this.budget;
    }

    public double payBonus() {
        return getSalary() * 0.02;
    }

}
