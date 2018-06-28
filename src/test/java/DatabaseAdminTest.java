import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Iona", "JG343435", 29000);
    }

    @Test
    public void raiseSalary(){
        assertEquals(30000, databaseAdmin.raiseSalary(1000), 0.01);
    }
}
