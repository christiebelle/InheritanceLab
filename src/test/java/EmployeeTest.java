import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before() {
        employee = new Employee("Christine", "AA112233A", 25000);
    }


    @Test
    public void hasName() {
        assertEquals("Christine", employee.getName());
    }

    @Test
    public void hasNI_Num() {
        assertEquals("AA112233A", employee.getNI_num());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, employee.getSalary());
    }

    @Test
    public void canChangeName() {
        employee.setName("Christie");
        assertEquals("Christie", employee.getName());
    }

    @Test
    public void canChangeNI_Num() {
        employee.setNI_num("AA112233B");
        assertEquals("AA112233B", employee.getNI_num());
    }

    @Test
    public void canChangeSalary() {
        employee.setSalary(30000);
        assertEquals(30000, employee.getSalary());
    }

    @Test
    public void canIncreaseSalary() {
        employee.increase(30000);
        assertEquals(30000, employee.getSalary());
    }


}
