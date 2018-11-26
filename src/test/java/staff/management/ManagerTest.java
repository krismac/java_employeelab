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

    @Test
    public void canGetSalary(){
        assertEquals(120000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetNatInsurance(){
        assertEquals( "JF123456", manager.getNatinsurance());
    }

    @Test
    public void canDeptName() {
        assertEquals("Operations", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.01);
        assertEquals(121200, manager.getSalary(), 0.01);
    }

    @Test
    public void canNotReduceSalaryWithRaiseSalary(){
        manager.raiseSalary(-0.01);
        assertEquals(120000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus(){
      assertEquals(1200, manager.payBonus(), 0.1);
    }

    @Test
    public void canSetName(){
        manager.setName("Luke");
        assertEquals("Luke", manager.getName());
    }

    @Test
    public void canNotSetEmptyName(){
        manager.setName("");
        assertEquals("Melinda", manager.getName());
    }

    @Test
    public void canNotSetEmptyManySpaceslName(){
        manager.setName("   ");
        assertEquals("Melinda", manager.getName());
    }
}
