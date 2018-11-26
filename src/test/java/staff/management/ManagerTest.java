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

    //  test getName
    @Test
    public void canGetName(){
        assertEquals("Melinda", manager.getName());
    }


//    test getSalary
    @Test
    public void canGetSalary(){
        assertEquals(120000.00, manager.getSalary());
    }

//    test getNatInsurance
    @Test
    public void canGetNatInsurance(){
        assertEquals( "JF123456", manager.getNatinsurance());
    }

//    test getDeptName
    @Test
    public void canDeptName() {
        assertEquals("Operations", manager.getDeptName());
    }

//    test raiseSalary
    @Test
    public void canGetRaiseSalary(){
        manager.raiseSalary();
        assertEquals(121200, manager.getRaiseSalary(), 0.1);
    }

//    test payBonus
    @Test
    public void canGetPayBonus(){
      assertEquals(121200, manager.getPayBonus());
    }
}
