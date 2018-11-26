package staff.management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Melinda", "JF123456", 120000.00, "Operations");
    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", manager.getName());
    }

//  test getName

//    test getSalary

    @Test
    public void canGetSalary(){
        assertEquals();

    }

//    test getNatInsurance

//    test getDeptName



//    test raiseSalary

//    test payBonus


}
