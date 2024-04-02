package com.prakash.model;

import java.time.LocalDate;

public record Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, Double yearlySalary, PensionPlan pensionPlan) {
    boolean isUpcomingEnroll() {
        var nextMonthLocalDate = LocalDate.now().plusMonths(1);
        var nextQualifyLocalDate = employmentDate.plusYears(5);
        return true;
    }
}
