package mg.herimanjaka.employeemanagement.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import mg.herimanjaka.employeemanagement.model.Employee;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService(List<Employee> initiaEmployees) {
        if (initiaEmployees != null) {
            this.employees = new ArrayList<>(initiaEmployees);
        } else {
            this.employees = new ArrayList<>();
        }
    }

    public boolean addEmployee(Employee e) {
        return this.employees.add(e);
    }

    public boolean removeEmployee(Employee e) {
        return this.employees.remove(e);
    }

    public Optional<Employee> getEmployeeById(int idEmployee) {
        return this.employees.stream()
                .filter(employee -> employee.getId() == idEmployee)
                .findFirst();
    }

    public List<Employee> getEmployeeByDepartment(String department) {
        return this.employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    public List<Employee> sortBy(Comparator<Employee> comp) {
        return this.employees.stream()
                .sorted(comp)
                .collect(Collectors.toList());
    }
}
