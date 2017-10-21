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
	 * 删除部门
	 * @param id
	 */
	void removeDepartment(int id);
	
	/**
	 * 判断部门内是否有用户存在
	 * @param id
	 * @return
	 */
	boolean isExistUser(int id);
	
}
