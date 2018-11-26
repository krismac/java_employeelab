package staff.techStaff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Keith", "CC7891011C", 26000.00);
    }

    @Test
    public void developerHasName() {
        assertEquals("Keith", developer.getName());
    }

    @Test
    public void developerHasNin() {
        assertEquals("CC7891011C", developer.getNatinsurance());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(26000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        developer.raiseSalary(0.02);
        assertEquals(26520, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(260, developer.payBonus(), 0.01);
    }
}
