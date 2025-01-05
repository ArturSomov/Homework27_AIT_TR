package homework27;

import java.util.ArrayList;

public class Department {

    private String name;
    private final ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove an employee by ID
    public void removeEmployee(String employeeId) {
        employees.removeIf(employee -> employee.getId().equals(employeeId));
    }

    // Find an employee by ID
    public Employee findEmployee(String employeeId) {
        for (Employee employee : employees) {
            if (employee.getId().equals(employeeId)) {
                return employee;
            }
        }
        return null; // Return null if not found
    }

    // Calculate total salary of all employees
    public double getTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    // Get all employees in the department
    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
