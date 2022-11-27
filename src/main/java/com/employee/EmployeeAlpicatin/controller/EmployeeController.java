package com.employee.EmployeeAlpicatin.controller;

import com.employee.EmployeeAlpicatin.entity.Employee;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {


    public List<Employee> findAllEmployees() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "First Employee", "Washington"),
                new Employee(2, "Second Employee", "New York")
                );
        return employeeList;

    }
}
