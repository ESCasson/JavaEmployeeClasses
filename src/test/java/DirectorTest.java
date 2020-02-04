import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Bob", "1234", 26000.00, "accountsPayable", 2000000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("1234", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26000.00, director.getSalary(), 2d);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("accountsPayable", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(31000.00, director.getSalary(), 2d);
    }

    @Test
    public void canPayBonus(){
        assertEquals(26000/100*2, director.payBonus(), 2d);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000000, director.getBudget(), 2d);
    }

}
