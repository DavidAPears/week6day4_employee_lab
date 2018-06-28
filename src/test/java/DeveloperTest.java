import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tony", "TS943435", 35000);
    }

    @Test
    public void raiseSalary(){
        assertEquals(36000, developer.raiseSalary(1000), 0.01);
    }

    @Test
    public void payBonus(){
        assertEquals(350, developer.payBonus(), 0.01);
    }
}