package com.employee.EmployeeAlpicatin.controller;

import com.employee.EmployeeAlpicatin.Entity.Employee;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class EmployeeController {
    public List<Employee> employeeList;

    public List<Employee> findAllEmployees(){
        return employeeList;
    }
}
