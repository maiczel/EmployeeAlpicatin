package com.employee.EmployeeAlpicatin.entity;

public class Employee {
    int employeeID;
    String employeeName;
    String employeeCity;

    public Employee(int employeeID, String employeeName, String employeeCity) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }
}
