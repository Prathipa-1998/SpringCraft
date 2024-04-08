package in.co.gradle.springCrud.service;

import java.util.List;

import in.co.gradle.springCrud.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);

    List<Employee> fetchAllEmployees();

    Employee getEmployeeById(Long id);

    Employee updateEmployeeById(Long id, Employee employee);

    String deleteDepartmentById(Long id);

}
