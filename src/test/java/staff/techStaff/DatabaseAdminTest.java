package staff.techStaff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sandy", "CC123456", 50000.00);
    }

    @Test
    public void adminHasName(){
        assertEquals("Sandy", databaseAdmin.getName());
    }

    @Test
    public void adminHasNI(){
        assertEquals("CC123456", databaseAdmin.getNatinsurance());
    }

    @Test
    public void adminHasSalary() {
        assertEquals(50000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(0.02);
        assertEquals(51000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(500, databaseAdmin.payBonus(), 0.01);
    }
}
