package com.example.solidexamplesp2.models;

import org.apache.commons.lang3.Validate;

import java.math.BigDecimal;

public class FullTimeEmployee implements Employee, TakeVacation{
    private final BigDecimal salary;
    private final Integer lengthService;

    public FullTimeEmployee(BigDecimal salary, Integer lengthService) {
        Validate.notNull(salary, "Salary can not be null");
        Validate.isTrue(salary.compareTo(BigDecimal.ZERO) > 0, "salary must be a positive number");

        Validate.notNull(lengthService, "Length Service can not be null");
        Validate.isTrue(lengthService>0,"Length Service must be a positive number");

        this.salary = salary;
        this.lengthService = lengthService;
    }

    @Override
    public BigDecimal calculateSeverancePay() {
        return salary.multiply(BigDecimal.valueOf(lengthService));
    }

    @Override
    public void takeVacation() {
        System.out.println("is taking vacations");
    }

}
