package java_erp_teacher.dao;

import java.util.ArrayList;

import java_erp_teacher.dto.Employee;

public interface EmployeeDao {
	ArrayList<Employee> selectEmployeeAll();
	Employee selectEmployeeByNo(Employee emp);
	
	int insertEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int deleteEmployee(Employee emp);
	
}
