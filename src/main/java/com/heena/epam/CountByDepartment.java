package com.heena.epam;

import java.util.*;
import java.util.stream.Collectors;

public class CountByDepartment {
    public static void main(String[] args) {
        //Override hashcode also
        //List.of(new Employee(1, "heena", "D1"));
        List<Employee> employees = new ArrayList<>();
        Map<String, Long> collect = employees.stream()
                .filter(employee -> employee.getName().equals("MH"))
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Collections.sort(employees, Comparator.comparing(Employee::getDoj));
        Map<String, List<Employee>> map = new HashMap<>();
       /* Map<String, Employee> collect1 = map.entrySet().stream()
                .map(stringListEntry -> {
                    List<Employee> values = stringListEntry.getValue();
                    values.sort(Comparator.comparing(Employee::getDoj));
                    return values.stream().findFirst().get();
                }).collect(Collectors.toMap(Employee::getDepartment, employee -> employee));*/


        Employee employee = map.entrySet().stream()
                .map(stringListEntry -> stringListEntry.getValue().stream().min(Comparator.comparing(Employee::getDoj)).get())
                .findFirst().get();
        //  .collect(Collectors.toMap(Employee::getDepartment, employee -> employee));

    }
}

class Employee {
    private final String id;
    private final String name;
    private final String department;
    private final Date doj;

    public Employee(String id, String name, String department, Date doj) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.doj = doj;
    }

    public String getId() {
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
