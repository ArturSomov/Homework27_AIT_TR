package homework27;

import java.util.HashMap;
import java.util.HashSet;

public class Business {

    private String name;
    private final HashMap<String, Department> departments;

    // Constructor
    public Business(String name) {
        this.name = name;
        this.departments = new HashMap<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Add a department
    public void addDepartment(Department department) {
        departments.put(department.getName(), department);
    }

    // Remove a department by name
    public void removeDepartment(String departmentName) {
        departments.remove(departmentName);
    }

    // Get a department by name
    public Department getDepartment(String departmentName) {
        return departments.get(departmentName);
    }

    // Get all unique positions in the company
    public HashSet<String> getAllPositions() {
        HashSet<String> positions = new HashSet<>();
        for (Department department : departments.values()) {
            for (Employee employee : department.getEmployees()) {
                positions.add(employee.getPosition());
            }
        }
        return positions;
    }

    // Calculate total salary of all employees in the company
    public double getTotalCompanySalary() {
        double total = 0;
        for (Department department : departments.values()) {
            total += department.getTotalSalary();
        }
        return total;
    }
}
