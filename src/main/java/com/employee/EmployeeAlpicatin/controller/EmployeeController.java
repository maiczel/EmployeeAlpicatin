package com.employee.EmployeeAlpicatin.controller;

import com.employee.EmployeeAlpicatin.entity.Employee;
import com.employee.EmployeeAlpicatin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
// @RestController -> zastepuje @Controller i @ResponseBody
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> findAllEmployees() {

        return employeeService.getAllEmployees();

    }
}
