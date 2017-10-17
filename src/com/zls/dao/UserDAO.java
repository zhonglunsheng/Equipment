package com.zls.dao;

import com.zls.model.User;

/**
 * 管理用户
 * @author zhonglunsheng
 *
 */
public interface UserDAO {
	/**
	 * 判断用户登录
	 * @param user
	 * @return
	 */
	User login(User user);
}
