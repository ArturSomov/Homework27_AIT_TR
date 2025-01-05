package homework27;

public class Main {

    public static void main(String[] args) {
        // Создание сотрудников
        Employee emp1 = new Employee("1", "Anna", "Developer", 7000);
        Employee emp2 = new Employee("2", "Mark", "Tester", 3000);
        Employee emp3 = new Employee("3", "Elena", "HR Manager", 8000);

        // Создание отделов и добавление сотрудников
        Department itDepartment = new Department("IT");
        itDepartment.addEmployee(emp1);
        itDepartment.addEmployee(emp2);

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(emp3);

        // Создание компании и добавление отделов
        Business business = new Business("Apple");
        business.addDepartment(itDepartment);
        business.addDepartment(hrDepartment);

        // Вывод информации о компании
        System.out.println("Компания: " + business.getName());
        System.out.println("Общая зарплата всех сотрудников компании: " + business.getTotalCompanySalary());

        // Уникальные должности
        System.out.println("Уникальные должности в компании: " + business.getAllPositions());

        // Информация по сотрудникам в отделе IT
        for (Employee employee : business.getDepartment("IT").getEmployees()) {
            System.out.println("Сотрудник IT отдела: " + employee.getInfo());
        }
    }
}
