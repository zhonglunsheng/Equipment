package com.zls.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zls.dao.UserDAO;
import com.zls.model.User;
import com.zls.service.UserService;
/**
 * �û�ҵ����߼�����
 * @author zhonglunsheng
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserDAO userDAO;

	@Override
	public User login(User user) {
		return userDAO.login(user);
	}
}
