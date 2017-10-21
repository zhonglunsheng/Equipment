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
	 * ɾ������
	 * @param id
	 */
	void removeDepartment(int id);
	
	/**
	 * �жϲ������Ƿ����û�����
	 * @param id
	 * @return
	 */
	boolean isExistUser(int id);
	
}
