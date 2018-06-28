import Staff.Employee;
import Staff.Management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void raiseSalary(){
        employee = new Manager("David", "JN572843", 28000, "tech");
        assertEquals(28100.00, employee.raiseSalary(100.00), 0.01 );
    }


    @Test
    public void cannotRaiseSalaryByNegativeAmount(){
        employee = new Manager("David", "JN572843", 28000, "tech");
        assertEquals(27900.00, employee.raiseSalary(-100.00), 0.01 );
    }
    @Test
    public void payBonus(){
        employee = new Manager("David", "JN572843", 28000, "tech");
        assertEquals(280, employee.payBonus(), 0.01);
    }

    @Test
    public void mustHaveName(){
        employee = new Manager("David", "JN572843", 28000, "tech");
        employee.setName(null);
        assertEquals("David", employee.getName());
    }
}
