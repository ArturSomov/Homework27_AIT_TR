import homework27.Business;
import homework27.Department;

import homework27.Employee;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessTest {

    @Test
    public void testAddDepartment() {
        Business business = new Business("Apple");
        Department itDepartment = new Department("IT");

        business.addDepartment(itDepartment);
        assertEquals(itDepartment, business.getDepartment("IT"));
    }

    @Test
    public void testRemoveDepartment() {
        Business business = new Business("Apple");
        Department itDepartment = new Department("IT");
        business.addDepartment(itDepartment);

        business.removeDepartment("IT");
        assertNull(business.getDepartment("IT"));
    }

    @Test
    public void testGetAllPositions() {
        Business business = new Business("Apple");
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        itDepartment.addEmployee(new Employee("1", "Anna", "Developer", 5000));
        itDepartment.addEmployee(new Employee("2", "Mark", "Tester", 4000));
        hrDepartment.addEmployee(new Employee("3", "Elena", "HR Manager", 6000));

        business.addDepartment(itDepartment);
        business.addDepartment(hrDepartment);

        HashSet<String> positions = business.getAllPositions();
        assertTrue(positions.contains("Developer"));
        assertTrue(positions.contains("Tester"));
        assertTrue(positions.contains("HR Manager"));
        assertEquals(3, positions.size());
    }

    @Test
    public void testGetTotalCompanySalary() {
        Business business = new Business("Apple");
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        itDepartment.addEmployee(new Employee("1", "Anna", "Developer", 5000));
        hrDepartment.addEmployee(new Employee("2", "Elena", "HR Manager", 6000));

        business.addDepartment(itDepartment);
        business.addDepartment(hrDepartment);

        double totalSalary = business.getTotalCompanySalary();
        assertEquals(11000, totalSalary);
    }

    @Test
    public void testDepartmentGetName() {
        Department department = new Department("Finance");
        assertEquals("Finance", department.getName());
    }

    @Test
    public void testDepartmentSetName() {
        Department department = new Department("Finance");
        department.setName("Operations");
        assertEquals("Operations", department.getName());
    }

    @Test
    public void testBusinessGetName() {
        Business business = new Business("Apple");
        assertEquals("Apple", business.getName());
    }

    @Test
    public void testBusinessSetName() {
        Business business = new Business("Apple");
        business.setName("Apple");
        assertEquals("Apple", business.getName());
    }
}
