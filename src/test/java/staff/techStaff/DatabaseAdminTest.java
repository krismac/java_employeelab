package staff.techStaff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdminTest databaseAdminTest;

    @Before
    public void before(){
        databaseAdminTest = new DatabaseAdminTest("Sandy", "CC123456", 50000,00);
    }

    //  test getName
    @Test
    public void adminHasName(){
        assertEquals("Sandy", databaseAdminTest.getName)
    }

    @Test
    public void adminHasNI(){
        assertEquals("CC123456", databaseAdminTest.getNatinsurance());
    }

    @Test
    public void adminHasSalary() {
        assertEquals(50000,00, databaseAdminTest.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        databaseAdminTest.raiseSalary();
        assertEquals(X, databaseAdminTest.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(X, databaseAdminTest.payBonus(), 0.01);
    }
}
