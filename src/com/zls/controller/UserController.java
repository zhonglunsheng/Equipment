package com.zls.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zls.model.User;
import com.zls.service.UserService;

/**
 * 用户控制层
 * @author zhonglunsheng
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(User user,HttpServletRequest request){
		User currentUser = userService.login(user);
		if (currentUser.getId()==null) {
			request.setAttribute("user", user);
			request.setAttribute("errorMsg", "用户名或密码错误！");
			return "login";
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", currentUser);
			return "main";
		}
		
	}
}
