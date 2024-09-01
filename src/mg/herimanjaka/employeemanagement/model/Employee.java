package mg.herimanjaka.employeemanagement.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private static int employeeCounter = 1;
    private int id;
    private String name;
    private LocalDate joiningDate;
    private String department;
    private double salary;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", joiningDate=" + joiningDate + ", department=" + department
                + ", salary=" + salary + "]";
    }

    // explicit default Constructor (bean specification)
    public Employee() {
    }

    public Employee(String name, LocalDate joiningDate, String department, double salary) {
        this.id = Employee.employeeCounter++;
        this.name = name;
        this.joiningDate = joiningDate;
        this.department = department;
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    @Override
    public int compareTo(Employee e) {
        return this.name.compareTo(e.getName());
    }

}
