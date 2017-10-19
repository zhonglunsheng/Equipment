package com.zls.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zls.dao.DepartmentDAO;
import com.zls.model.Department;
import com.zls.model.PageBean;
import com.zls.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	@Resource
	DepartmentDAO departmentDAO;

	@Override
	public List<Department> findDepartmentList(Department s_department,PageBean pageBean) {
		return departmentDAO.findDepartmentList(s_department, pageBean);
	}

	@Override
	public int countDepartment(Department s_department) {
		return departmentDAO.countDepartment(s_department);
	}
	
}
