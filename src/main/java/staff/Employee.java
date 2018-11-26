package staff;

public abstract class Employee {

    protected String name;
    protected String natinsurance;
    protected double salary;

    public Employee(String name, String natinsurance, double salary ) {
        this.name = name;
        this.natinsurance = natinsurance;
        this.salary = salary;
    }


    //getters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null  && !name.trim().isEmpty()) {
            this.name = name;
        }
        return;
    }

    public String getNatinsurance() {
        return this.natinsurance;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raiseBy){
        if (raiseBy > 0) {
            this.salary = this.salary * (1 + raiseBy);
        }
        return;
    }

    public double payBonus(){
        return this.salary*0.01;
    }



}

