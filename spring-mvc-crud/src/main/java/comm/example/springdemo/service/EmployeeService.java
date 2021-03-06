package comm.example.springdemo.service;

import java.util.List;

import comm.example.springdemo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();

	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
	
}
