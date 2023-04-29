package com.employee.EmployeeAlpicatin;

import com.employee.EmployeeAlpicatin.entity.Address;
import com.employee.EmployeeAlpicatin.entity.Employee;
import com.employee.EmployeeAlpicatin.entity.Project;
import com.employee.EmployeeAlpicatin.entity.Spouse;
import com.employee.EmployeeAlpicatin.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeAlpicatinApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeAlpicatinApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(EmployeeService employeeService){
		return(args) ->{

			Address address1 = new Address("Line 1","Line ","ZipCode", "City1","State1","Country1");
			Project project1 = new Project("Name1","Client Name1");
			Spouse spouse1 = new Spouse("Name", "Mobile1", 30);
			Employee employee = new Employee("Employee1", "City1");
			employee.addProject(project1);
			employee.addAddress(address1);
			employee.setSpouse(spouse1);

			employeeService.createEmployee(employee);

			System.out.println("Getting an employee");
			Employee employee1 = employeeService.getAnEmployee(1);
		};
	}
}
