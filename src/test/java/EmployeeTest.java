import homework27.Employee;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testEmployeeConstructor() {
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);
        assertEquals("1", employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals("Developer", employee.getPosition());
        assertEquals(5000, employee.getSalary());
    }

    @Test
    public void testSettersAndGetters() {
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);
        employee.setId("2");
        employee.setName("Jane Doe");
        employee.setPosition("Manager");
        employee.setSalary(7000);

        assertEquals("2", employee.getId());
        assertEquals("Jane Doe", employee.getName());
        assertEquals("Manager", employee.getPosition());
        assertEquals(7000, employee.getSalary());
    }

    @Test
    public void testGetInfo() {
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);
        String info = employee.getInfo();
        assertEquals("Employee ID: 1, Name: John Doe, Position: Developer, Salary: 5000.0", info);
    }
}
