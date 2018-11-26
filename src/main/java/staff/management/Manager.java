package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String natinsurance, double salary, String deptName){
        super(name, natinsurance, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

}



