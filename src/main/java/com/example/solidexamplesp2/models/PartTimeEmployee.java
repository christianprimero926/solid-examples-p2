package com.example.solidexamplesp2.models;

import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PartTimeEmployee implements Employee{
    private final BigDecimal salary;
    private final Integer lengthService;
    private final WorkingHours workingHour;

    public PartTimeEmployee(BigDecimal salary, Integer lengthService, WorkingHours workingHour) {
        Validate.notNull(salary, "Salary can not be null");
        Validate.isTrue(salary.compareTo(BigDecimal.ZERO) > 0, "salary must be a positive number");

        Validate.notNull(lengthService, "Length Service can not be null");
        Validate.isTrue(lengthService>0,"Length Service must be a positive number");

        this.salary = salary;
        this.lengthService = lengthService;
        this.workingHour = workingHour;
    }

    @Override
    public BigDecimal calculateSeverancePay() {
        if (workingHour.equals(WorkingHours.AM)){
            return salary.multiply(BigDecimal.valueOf(lengthService)).divide(BigDecimal.valueOf(2), 1, RoundingMode.UP);
        }else {
            return salary.multiply(BigDecimal.valueOf(lengthService));
        }
    }
}
