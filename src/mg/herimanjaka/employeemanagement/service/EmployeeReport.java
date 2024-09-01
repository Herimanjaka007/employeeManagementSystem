package mg.herimanjaka.employeemanagement.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import mg.herimanjaka.employeemanagement.model.Employee;

public class EmployeeReport {
    public static Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    public static Map<String, Long> countEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));
    }

    public static double totalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
