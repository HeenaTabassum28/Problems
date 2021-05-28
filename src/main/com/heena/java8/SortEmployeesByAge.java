package com.heena.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesByAge {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        employees.add(new Employee("Heena", 20));
        employees.add(new Employee("Heena1", 10));
        employees.add(new Employee("Heena2", 80));

        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName))
                .collect(Collectors.toList());

        List<Employee> collect1 = employees.stream()
                .sorted((o1, o2) -> o2.getAge() - o1.getAge())
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);

    }
}
