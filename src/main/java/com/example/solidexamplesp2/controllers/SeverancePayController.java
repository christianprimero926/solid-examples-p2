package com.example.solidexamplesp2.controllers;

import com.example.solidexamplesp2.services.SeverancePayService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/severance")
@AllArgsConstructor
public class SeverancePayController {
    SeverancePayService severancePayService;

    @GetMapping("calculate/{employeeId}")
    public BigDecimal calculateSeverancePay(@PathVariable int employeeId) {
        return severancePayService.getEmployeeById(employeeId).calculateSeverancePay();
    }
}
