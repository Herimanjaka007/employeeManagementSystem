package mg.herimanjaka.employeemanagement;

import java.time.LocalDate;
import java.util.List;

import mg.herimanjaka.employeemanagement.model.Employee;
import mg.herimanjaka.employeemanagement.service.EmployeeComparator;
import mg.herimanjaka.employeemanagement.service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService manager = new EmployeeService(
                List.of(
                        new Employee("Andrianina", LocalDate.of(2020, 1, 15), "Engineering", 75000),
                        new Employee("Rasoa", LocalDate.of(2019, 6, 23), "Marketing", 65000),
                        new Employee("Razafindralambo", LocalDate.of(2021, 3, 12), "Engineering", 80000),
                        new Employee("Andriamatoa", LocalDate.of(2018, 11, 2), "HR", 70000),
                        new Employee("Ravelo", LocalDate.of(2022, 7, 19), "Finance", 72000),
                        new Employee("Rakoto", LocalDate.of(2020, 4, 10), "IT", 68000),
                        new Employee("Rasoarimanga", LocalDate.of(2017, 9, 15), "Admin", 67000)));

        manager.addEmployee(new Employee("Razanadrainy", LocalDate.of(2023, 2, 1), "Operations", 71000));
        List<Employee> engineerEmployee = manager.getEmployeeByDepartment("engineering");
        System.out.println("Person in engineering department");
        engineerEmployee.forEach(System.out::println);

        System.out.println("Sorting employees by salary");
        manager.sortBy(EmployeeComparator.compareBySalary)
                .forEach(System.out::println);
    }
}
