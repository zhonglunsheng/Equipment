package com.zls.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.zls.dao.DepartmentDAO;
import com.zls.model.Department;
import com.zls.model.PageBean;
import com.zls.util.StringUtil;
/**
 * 部门管理实现
 * @author zhonglunsheng
 *
 */
@Repository("departmentDAO")
public class DepartmentDAOImpl implements DepartmentDAO{

	@Resource
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Department> findDepartmentList(Department s_department,PageBean pageBean) {
		StringBuffer sb = new StringBuffer("select * from t_department");
		if (s_department!=null) {
			if (StringUtil.isNotEmpty(s_department.getDeptName())) {
				sb.append(" where deptName like '%"+s_department.getDeptName()+"%'");
			}
		}
		if (pageBean!=null) {
			sb.append(" limit ?,?");
		}
		final List<Department> departmentList = new ArrayList<Department>();
		jdbcTemplate.query(sb.toString(), new Object[]{pageBean.getStart(),pageBean.getPageSize()}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Department department = new Department();
				department.setId(rs.getInt("id")); 
				department.setDeptName(rs.getString("deptName"));
				department.setRemark(rs.getString("remark"));
				departmentList.add(department);
			}
		});
		return departmentList;
		
	}

	@Override
	public int countDepartment(Department s_department) {
		StringBuffer sb = new StringBuffer("select count(*) as total from t_department");
		if (s_department!=null) {
			if (StringUtil.isNotEmpty(s_department.getDeptName())) {
				sb.append(" where deptName like '%"+s_department.getDeptName()+"%'");
			}
		}
		return jdbcTemplate.queryForObject(sb.toString(),Integer.class);
	}

	@Override
	public int saveDepartment(Department department) {
		String sql = "insert into t_department values(null,?,?)";
		return jdbcTemplate.update(sql, department.getDeptName(),department.getRemark());
	}

	@Override
	public Department getDepartmentById(int id) {
		String sql = "select * from t_department where id=?";
		final Department department = new Department();
		jdbcTemplate.query(sql, new Object[]{id}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				department.setId(rs.getInt("id")); 
				department.setDeptName(rs.getString("deptName"));
				department.setRemark(rs.getString("remark"));
			}
		});
		return department;
	}

	@Override
	public void updateDepartment(Department department) {
		// TODO 自动生成的方法存根
		String sql = "update t_department set deptName=?,remark=? where id=?";
		jdbcTemplate.update(sql,new Object[]{department.getDeptName(),department.getRemark(),department.getId()});
	}

	@Override
	public boolean isExistUser(int id) {
		String sql = "select count(*) from t_user where id=?";
		int result = jdbcTemplate.queryForObject(sql, new Object[]{id}, Integer.class);
		if (result>0) {
			return true;
		}
		return false;
	}

	@Override
	public void removeDepartment(int id) {
		String sql = "delete from t_department where id=?";
		jdbcTemplate.update(sql,id);
	}

}
