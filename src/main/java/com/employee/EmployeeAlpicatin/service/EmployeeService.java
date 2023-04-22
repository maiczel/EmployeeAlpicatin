package com.employee.EmployeeAlpicatin.service;

import com.employee.EmployeeAlpicatin.entity.Addresses;
import com.employee.EmployeeAlpicatin.entity.Employee;
import com.employee.EmployeeAlpicatin.entity.Project;
import com.employee.EmployeeAlpicatin.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employeeList = new ArrayList<>(Arrays.asList(
            new Employee(1, "First Employee", "Washington"),
            new Employee(2, "Second Employee", "New York")
    ));
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        //return employeeList;
        return employeeRepository.findAll();
    }


    public Employee getAnEmployee(int id) {
        //return employeeList.stream().filter(e -> (e.getEmployeeId() == id)).findFirst().get();
        return employeeRepository.findById(id).orElseThrow(() ->new RuntimeException("not found"));
    }


    public void createEmployee(Employee employee) {
        //employeeList.add(employee);
        ArrayList<Addresses> addressesArrayList = new ArrayList<>();

        for (Addresses addresses : employee.getAddresses()) {
            addressesArrayList.add((new Addresses(addresses.getLine1(),
                    addresses.getLine2(),
                    addresses.getZipCode(),
                    addresses.getCity(),
                    addresses.getState(),
                    addresses.getCountry(), employee)));
        }
        employee.setAddresses(addressesArrayList);
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        /*ArrayList<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getEmployeeId() == employee.getEmployeeId()) {
                emp.setEmployeeName(employee.getEmployeeName());
                emp.setEmployeeCity(employee.getEmployeeCity());
            }
            tempEmployee.add(emp);
        }
        this.employeeList = tempEmployee;*/
        employeeRepository.save(employee);

    }

    public void deleteEmployee(int id) {
        /*ArrayList<Employee> tempEmployee = new ArrayList<>();
        for (Employee emp : employeeList) {
            if (emp.getEmployeeId() == id)
                continue;
            tempEmployee.add(emp);
        }
        this.employeeList = tempEmployee;*/
        employeeRepository.delete(employeeRepository.getById(id));

    }
}

