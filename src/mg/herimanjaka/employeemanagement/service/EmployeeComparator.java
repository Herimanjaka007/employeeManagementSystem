package mg.herimanjaka.employeemanagement.service;

import java.util.Comparator;

import mg.herimanjaka.employeemanagement.model.Employee;

public class EmployeeComparator {
    public static Comparator<Employee> compareBySalary = Comparator.comparingDouble(Employee::getSalary);
    public static Comparator<Employee> compareByJoiningDate = Comparator.comparing(Employee::getJoiningDate);
    public static Comparator<Employee> compareByName = Comparator.comparing(Employee::getName);
}
