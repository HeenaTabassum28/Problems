package com.heena.epam;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeFeature {

    public static Map<String, Long> calculate(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    public static void sortInAscending(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getDoj));
    }

    public static void sortInDescending(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getDoj).reversed());
    }

    public static Employee findFirstEmployeeJoined(List<Employee> employees) {
        return employees.stream().min(Comparator.comparing(Employee::getDoj)).get();
    }

    public static Employee findLastEmployeeJoined(List<Employee> employees) {
        return employees.stream().max(Comparator.comparing(Employee::getDoj)).get();
    }
}

class Employee {
    private final Integer id;
    private final String name;
    private final String department;
    private final Date doj;

    public Employee(Integer id, String name, String department, Date doj) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.doj = doj;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Date getDoj() {
        return doj;
    }
}
