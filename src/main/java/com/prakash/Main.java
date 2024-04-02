package com.prakash;

import com.prakash.model.Employee;
import com.prakash.model.PensionPlan;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) {
        var pensionPlanOne = new PensionPlan("EX1089", LocalDate.of(2023, 1, 17), 100.0);
        var pensionPlanTwo = new PensionPlan("SM2307", LocalDate.of(2019, 11, 4), 1555.0);

        Employee employees[] = {
                new Employee(11111111111L, "Daniel", "Agar", LocalDate.of(2018, 1, 17), 105945.50, pensionPlanOne),
                new Employee(11111111112L, "Benard", "Shaw", LocalDate.of(2019, 4, 3), 197750.00, null),
                new Employee(11111111113L, "Carly", "Agar", LocalDate.of(2014, 5, 16), 842000.75, pensionPlanTwo),
                new Employee(11111111114L, "Wesley", "Schneider", LocalDate.of(2019, 5, 2), 74500.00, null),
        };

        var sortedEmployees = Arrays.stream(employees)
                .sorted(Comparator.comparing(Employee::lastName).thenComparing(Employee::yearlySalary, Comparator.reverseOrder())).toList();

        System.out.println(sortedEmployees);
    }
}