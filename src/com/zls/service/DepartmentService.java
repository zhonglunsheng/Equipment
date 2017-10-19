package com.zls.service;

import java.util.List;

import com.zls.model.Department;
import com.zls.model.PageBean;
/**
 * ����ҵ��
 * @author zhonglunsheng
 *
 */
public interface DepartmentService {
	/**
	 * �����б�
	 * @param s_department
	 * @return
	 */
	
	List<Department> findDepartmentList(Department s_department,PageBean pageBean);
	/**
	 * ��������
	 * @param s_Department
	 * @return
	 */
	
	int countDepartment(Department s_department);
	
}
