package java_erp_teacher.dao;

import java.util.ArrayList;

import java_erp_teacher.dto.Department;

public interface DepartmentDao {
	ArrayList<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department department);
	
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deleteDepartment(Department department);
}
