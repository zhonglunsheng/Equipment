package com.zls.dao;

import java.util.List;

import com.zls.model.Department;
import com.zls.model.PageBean;

/**
 * ���Ź���
 * @author zhonglunsheng
 *
 */
public interface DepartmentDAO {
	/**
	 * ���Ҳ���������Ϣ
	 * @param s_department
	 * @return
	 */
	List<Department> findDepartmentList(Department s_department,PageBean pageBean);
	
	/**
	 * ��ȡ��������
	 * @param s_depatrment
	 * @return
	 */
	int countDepartment(Department s_department);
	
	/**
	 * ��Ӳ���
	 * @param department
	 * @return
	 */
	int saveDepartment(Department department);
}
