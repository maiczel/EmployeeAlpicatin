package com.employee.EmployeeAlpicatin.controller;

import com.employee.EmployeeAlpicatin.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
// @RestController -> zastepuje @Controller i @ResponseBody
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> findAllEmployees() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "First Employee", "Washington"),
                new Employee(2, "Second Employee", "New York")
                );
        return employeeList;

    }
}
