package com.zls.dao;

import java.util.List;

import com.zls.model.Department;
import com.zls.model.PageBean;

/**
 * 部门管理
 * @author zhonglunsheng
 *
 */
public interface DepartmentDAO {
	/**
	 * 查找部门所有信息
	 * @param s_department
	 * @return
	 */
	List<Department> findDepartmentList(Department s_department,PageBean pageBean);
	
	/**
	 * 获取部门数量
	 * @param s_depatrment
	 * @return
	 */
	int countDepartment(Department s_department);
	
	/**
	 * 添加部门
	 * @param department
	 * @return
	 */
	int saveDepartment(Department department);
}
