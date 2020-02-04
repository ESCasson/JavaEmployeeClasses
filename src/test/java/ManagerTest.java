import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import staff.management.Manager;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "1234", 26000.00, "accountsPayable");
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("1234", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26000.00, manager.getSalary(), 2d);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("accountsPayable", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(31000.00, manager.getSalary(), 2d);
    }

    @Test
    public void canSetName(){
        manager.setName("Steve");
        assertEquals("Steve", manager.getName());
    }
    @Test
    public void canSetNameNull(){
        manager.setName(null);
        assertEquals("Bob", manager.getName());
    }


    @Test
    public void canRaiseSalaryNotNegative(){
        manager.raiseSalary(-5000);
        assertEquals(26000.00, manager.getSalary(), 2d);
    }

    @Test
    public void canPayBonus(){
        assertEquals(26000/100, manager.payBonus(), 2d);
    }

}
