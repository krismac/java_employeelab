package staff.management;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Graham", "JF7891011", 150000.00, "Board", 250000.00);
    }

    //    test getNatInsurance
    @Test
    public void directorhasNI({
        assertEquals("JF7891011", director.getNatinsurance());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(150000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDepartment() {
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary();
        assertEquals(X, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(X, director.payBonus(), 0.01);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(250000, director.getBudget(), 0.01);
    }


}
