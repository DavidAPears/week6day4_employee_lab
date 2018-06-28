import Staff.Management.Director;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("John", "JP379402", 40000, "management", 10000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000, director.getBudget());
    }

    @Test
    public void raiseSalary(){
        TestCase.assertEquals(41000, director.raiseSalary(1000), 0.01);
    }

    @Test
    public void payBonus(){
        TestCase.assertEquals(400, director.payBonus(), 0.01);
    }
}
