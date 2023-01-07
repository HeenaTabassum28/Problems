package com.heena.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

class EmployeeFeatureTest {

    @Test
    void shouldReturnNoOfEmployeeInEachDepartment() {
        Date date = asDate(LocalDate.of(2022, 11, 29));
        List<Employee> employees = Arrays.asList(new Employee(1, "Emp1", "Dep1", date),
                new Employee(2, "Emp2", "Dep2", date),
                new Employee(3, "Emp3", "Dep1", date),
                new Employee(4, "Emp4", "Dep3", date));
        Map<String, Long> employeeCountByDepartment = EmployeeFeature.calculate(employees);
        Assertions.assertEquals(2, employeeCountByDepartment.get("Dep1"));
        Assertions.assertEquals(1, employeeCountByDepartment.get("Dep2"));
        Assertions.assertEquals(1, employeeCountByDepartment.get("Dep3"));
    }

    @Test
    void verifyEmployeesAreSortedByDoj() {
        List<Employee> employees = Arrays.asList(new Employee(1, "Emp1", "Dep1", asDate(LocalDate.of(2022, 11, 29))),
                new Employee(2, "Emp2", "Dep2", asDate(LocalDate.of(2022, 10, 29))),
                new Employee(3, "Emp3", "Dep1", asDate(LocalDate.of(2022, 11, 27))),
                new Employee(4, "Emp4", "Dep3", asDate(LocalDate.of(2022, 11, 11))));
        EmployeeFeature.sortInAscending(employees);
        Assertions.assertEquals(2, employees.get(0).getId());
        Assertions.assertEquals(4, employees.get(1).getId());
        Assertions.assertEquals(3, employees.get(2).getId());
        Assertions.assertEquals(1, employees.get(3).getId());
    }

    @Test
    void verifyEmployeesAreSortedInDescendingByDoj() {
        List<Employee> employees = Arrays.asList(new Employee(1, "Emp1", "Dep1", asDate(LocalDate.of(2022, 11, 29))),
                new Employee(2, "Emp2", "Dep2", asDate(LocalDate.of(2022, 10, 29))),
                new Employee(3, "Emp3", "Dep1", asDate(LocalDate.of(2022, 11, 27))),
                new Employee(4, "Emp4", "Dep3", asDate(LocalDate.of(2022, 11, 11))));
        EmployeeFeature.sortInDescending(employees);
        Assertions.assertEquals(1, employees.get(0).getId());
        Assertions.assertEquals(3, employees.get(1).getId());
        Assertions.assertEquals(4, employees.get(2).getId());
        Assertions.assertEquals(2, employees.get(3).getId());
    }

    @Test
    void shouldReturnFirstEmployeeJoined() {
        List<Employee> employees = Arrays.asList(new Employee(1, "Emp1", "Dep1", asDate(LocalDate.of(2022, 11, 29))),
                new Employee(2, "Emp2", "Dep2", asDate(LocalDate.of(2022, 10, 29))),
                new Employee(3, "Emp3", "Dep1", asDate(LocalDate.of(2022, 11, 27))),
                new Employee(4, "Emp4", "Dep3", asDate(LocalDate.of(2022, 11, 11))));
        Employee firstJoined = EmployeeFeature.findFirstEmployeeJoined(employees);
        Assertions.assertEquals(2, firstJoined.getId());
    }

    @Test
    void shouldReturnLastEmployeeJoined() {
        List<Employee> employees = Arrays.asList(new Employee(1, "Emp1", "Dep1", asDate(LocalDate.of(2022, 11, 29))),
                new Employee(2, "Emp2", "Dep2", asDate(LocalDate.of(2022, 10, 29))),
                new Employee(3, "Emp3", "Dep1", asDate(LocalDate.of(2022, 11, 27))),
                new Employee(4, "Emp4", "Dep3", asDate(LocalDate.of(2022, 11, 11))));
        Employee firstJoined = EmployeeFeature.findLastEmployeeJoined(employees);
        Assertions.assertEquals(1, firstJoined.getId());
    }

    private Date asDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

}