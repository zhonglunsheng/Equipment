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
	
	/**
	 * 获取单个部门信息
	 * @param id
	 * @return
	 */
	Department getDepartmentById(int id);
	
	/**
	 * 修改部门信息
	 * @param department
	 * @return
	 */
	void updateDepartment(Department department);
	
	/**
	 * 判断部门内是否有用户存在
	 * @param id
	 * @return
	 */
	boolean isExistUser(int id);
	
	/**
	 * 删除部门
	 * @param id
	 */
	void removeDepartment(int id);
	
}
