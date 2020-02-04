import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "1234", 26000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("1234", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26000.00, developer.getSalary(), 2d);
    }



    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(31000.00, developer.getSalary(), 2d);
    }

    @Test
    public void canPayBonus(){
        assertEquals(26000/100, developer.payBonus(), 2d);
    }
}
