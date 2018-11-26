package staff.management;

import staff.Employee;

//    Create a class for Manager. Done
public class Manager extends Employee {

    private String deptName;

    //    Create a constructor that includes all the parameters needed for Employee and deptName.
    public Manager(String name, String natinsurance, double salary, String deptName){
        super(name, natinsurance, salary);
        this.deptName = deptName;
        //    Add a property to store the department name in a property called deptName.
    }

    //    Add a getter method for deptName.
    public String getDeptName() {
        return deptName;
    }

}



