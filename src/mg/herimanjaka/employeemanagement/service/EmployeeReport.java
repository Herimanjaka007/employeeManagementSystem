package mg.herimanjaka.employeemanagement.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import mg.herimanjaka.employeemanagement.model.Employee;

public class EmployeeReport {
    /**
     * Calculates the average salary for each department from the given list of
     * employees.
     *
     * @param employees the list of employees to process
     * @return a Map where the keys are department names and the values are the
     *         average salary of employees in that department
     */
    public static Map<String, Double> averageSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    /**
     * Counts the number of employees in each department.
     *
     * @param employees the list of employees to process
     * @return a Map of department and the number of employees
     */
    public static Map<String, Long> countEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()));
    }

    /**
     * Counts the number of employees in the specified department.
     *
     * @param employees  the list of employees to process
     * @param department the department name to filter by
     * @return the number of employees in the specified department
     */
    public static long countEmployeesByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(department))
                .count();
    }

    /**
     * Calculates the total salary of all employees in the given list.
     *
     * @param employees the list of employees to process
     * @return the total salary of all employees
     */
    public static double totalSalary(List<Employee> employees) {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
