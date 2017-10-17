package com.zls.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.zls.dao.UserDAO;
import com.zls.model.User;
/**
 * 用户数据访问实现
 * @author zhonglunsheng
 *
 */
@Repository("userDAO")
public class UserDaoImpl implements UserDAO{

	@Resource
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	@Override
	public User login(User user) {
		String sql = "select * from t_user where userName=? and password=?";
		final User resultUser = new User();
		jdbcTemplate.query(sql, new Object[]{user.getUserName(),user.getPassword()},new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				resultUser.setId(rs.getInt("id"));
				resultUser.setUserName(rs.getString("userName"));
				resultUser.setPassword(rs.getString("password"));
				resultUser.setRoleName(rs.getString("roleName"));
			}
		});
		return resultUser;
	}

}
