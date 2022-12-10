package com.employee.EmployeeAlpicatin.repository;

import com.employee.EmployeeAlpicatin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{


    /*
    *CRUD ( CREAT, READ, UPDATE, DELETE)
    *
    * getAllEmployees();
    * getEmployee(id);
    * updateEmployee(Employee employee)
    * deleteEmployee(Employee employee)
    *
     */
}
