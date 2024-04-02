package com.prakash.model;

import java.time.LocalDate;

public record PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {

}
