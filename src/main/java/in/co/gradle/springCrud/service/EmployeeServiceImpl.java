package in.co.gradle.springCrud.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.gradle.springCrud.entity.Employee;
import in.co.gradle.springCrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> allEmployee=employeeRepository.findAll();
		return allEmployee;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeRepository.findById(id);
		if(employee.isPresent())	
		{
			return employee.get();
		}
		return null;
	}

	@Override
	public Employee updateEmployeeById(Long id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> employee1 = employeeRepository.findById(id);

        if (employee1.isPresent()) {
            Employee originalEmployee = employee1.get();

            if (Objects.nonNull(employee.getEmpname()) && !"".equalsIgnoreCase(employee.getEmpname())) {
                originalEmployee.setEmpname(employee.getEmpname());
            }
            
            if (Objects.nonNull(employee.getEmpAddress()) && !"".equalsIgnoreCase(employee.getEmpAddress())) {
                originalEmployee.setEmpAddress(employee.getEmpAddress());
            }
            if (Objects.nonNull(employee.getSalary()) && employee.getSalary() != 0) {
                originalEmployee.setSalary(employee.getSalary());
            }
            if (Objects.nonNull(employee.getMobnum()) && employee.getMobnum() != 0) {
                originalEmployee.setMobnum(employee.getMobnum());
            }
            return employeeRepository.save(originalEmployee);
        }
        return null;
	}

	@Override
	public String deleteDepartmentById(Long id) {
		// TODO Auto-generated method stub
		if(employeeRepository.findById(id).isPresent())
		{
			employeeRepository.deleteById(id);
			return "employee deleted sucessfully";
		}
		return "unable to delete employee";
	}

}
