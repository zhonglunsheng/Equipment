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
	
	/**
	 * ��ȡ����������Ϣ
	 * @param id
	 * @return
	 */
	Department getDepartmentById(int id);
	
	/**
	 * �޸Ĳ�����Ϣ
	 * @param department
	 * @return
	 */
	void updateDepartment(Department department);
	
	/**
	 * �жϲ������Ƿ����û�����
	 * @param id
	 * @return
	 */
	boolean isExistUser(int id);
	
	/**
	 * ɾ������
	 * @param id
	 */
	void removeDepartment(int id);
	
}
