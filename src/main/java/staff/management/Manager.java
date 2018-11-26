package staff.management;


import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String natinsurance, double salary, String deptName){
        super(name, natinsurance, salary);
        this.deptName = deptName;
    }

//    public String getName() {
//        return this.name;
//    }
}
//    Create a class for Manager. Done

//    Add a property to store the department name in a property called deptName.


//    Create a constructor that includes all the parameters needed for Employee and deptName.
//    Add a getter method for deptName.
//    Test all methods including raiseSalary and payBonus



