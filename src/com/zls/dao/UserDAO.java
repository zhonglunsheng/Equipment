package com.zls.dao;

import com.zls.model.User;

/**
 * �����û�
 * @author zhonglunsheng
 *
 */
public interface UserDAO {
	/**
	 * �ж��û���¼
	 * @param user
	 * @return
	 */
	User login(User user);
}
