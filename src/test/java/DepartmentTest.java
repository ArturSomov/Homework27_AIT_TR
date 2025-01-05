import homework27.Department;
import homework27.Employee;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepartmentTest {

    @Test
    public void testAddEmployee() {
        Department department = new Department("IT");
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);

        department.addEmployee(employee);
        ArrayList<Employee> employees = department.getEmployees();

        assertTrue(employees.contains(employee));
    }

    @Test
    public void testRemoveEmployee() {
        Department department = new Department("IT");
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);

        department.addEmployee(employee);
        department.removeEmployee("1");

        assertNull(department.findEmployee("1"));
    }

    @Test
    public void testFindEmployee() {
        Department department = new Department("IT");
        Employee employee = new Employee("1", "John Doe", "Developer", 5000);

        department.addEmployee(employee);
        Employee foundEmployee = department.findEmployee("1");

        assertEquals(employee, foundEmployee);
    }

    @Test
    public void testGetTotalSalary() {
        Department department = new Department("IT");
        department.addEmployee(new Employee("1", "John Doe", "Developer", 5000));
        department.addEmployee(new Employee("2", "Jane Smith", "Manager", 7000));

        double totalSalary = department.getTotalSalary();
        assertEquals(12000, totalSalary);
    }

    @Test
    public void testGetEmployees() {
        Department department = new Department("IT");
        Employee employee1 = new Employee("1", "John Doe", "Developer", 5000);
        Employee employee2 = new Employee("2", "Jane Smith", "Manager", 7000);

        department.addEmployee(employee1);
        department.addEmployee(employee2);

        ArrayList<Employee> employees = department.getEmployees();
        assertEquals(2, employees.size());
        assertTrue(employees.contains(employee1));
        assertTrue(employees.contains(employee2));
    }

    @Test
    public void testGetName() {
        Department department = new Department("IT");
        String name = department.getName();
        assertEquals("IT", name);
    }

    @Test
    public void testSetName() {
        Department department = new Department("IT");
        department.setName("HR");
        assertEquals("HR", department.getName());
    }
}
