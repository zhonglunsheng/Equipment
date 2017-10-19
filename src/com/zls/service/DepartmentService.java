package com.zls.service;

import java.util.List;

import com.zls.model.Department;
import com.zls.model.PageBean;
/**
 * 部门业务
 * @author zhonglunsheng
 *
 */
public interface DepartmentService {
	/**
	 * 部门列表
	 * @param s_department
	 * @return
	 */
	
	List<Department> findDepartmentList(Department s_department,PageBean pageBean);
	/**
	 * 部门数量
	 * @param s_Department
	 * @return
	 */
	
	int countDepartment(Department s_department);
	
}
