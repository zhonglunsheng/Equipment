package com.zls.service;

import com.zls.model.User;

/**
 * 用户
 * @author zhonglunsheng
 *
 */
public interface UserService {
	/**
	 * 用户业务逻辑处理判断登录
	 * @param user
	 * @return
	 */
	User login(User user);
}
