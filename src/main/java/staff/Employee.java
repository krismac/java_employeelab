package staff;

public abstract class Employee {

    //    Employee will have a name, NI number and salary.

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

    public String getNatinsurance() {
        return this.natinsurance;
    }

    public double getSalary() {
        return this.salary;
    }



    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNatinsurance(String natinsurance) {
        this.natinsurance = natinsurance;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
    public void raiseSalary(double raiseBy){
        this.salary = this.salary*raiseBy;
    }

//    Add a method called payBonus which returns 1% of the employees salary.
    public double payBonus(){
        return this.salary*0.01;
    }

//    Don't worry about testing just now until you create the subclasses.

}

