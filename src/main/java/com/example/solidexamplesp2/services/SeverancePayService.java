package com.example.solidexamplesp2.services;

import com.example.solidexamplesp2.models.Employee;
import com.example.solidexamplesp2.models.FullTimeEmployee;
import com.example.solidexamplesp2.models.PartTimeEmployee;
import com.example.solidexamplesp2.models.WorkingHours;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SeverancePayService {
    public Employee getEmployeeById(int id) {
        return getAllEmployees().get(id);
    }

    private List<Employee> getAllEmployees() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(BigDecimal.valueOf(850000), 24));
        employees.add(new FullTimeEmployee(BigDecimal.valueOf(450000), 24));
        employees.add(new PartTimeEmployee(BigDecimal.valueOf(180000), 36, WorkingHours.PM));
        employees.add(new PartTimeEmployee(BigDecimal.valueOf(80000), 18, WorkingHours.AM));
        return employees;
    }
}
