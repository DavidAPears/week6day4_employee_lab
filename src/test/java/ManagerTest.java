import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("David", "JN683932", 28000, "tech");
    }

    @Test
    public void hasDeptName(){
        assertEquals("tech", manager.getDeptName());
    }

//
}
