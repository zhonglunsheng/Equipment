package com.zls.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zls.model.Department;
import com.zls.model.PageBean;
import com.zls.service.DepartmentService;
import com.zls.util.PageUtil;
import com.zls.util.StringUtil;

@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Resource
	private DepartmentService departmentService;
	/**
	 * 获取部门列表
	 * @param page
	 * @param s_department
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="page",required=false)String page,Department s_department,HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		if (StringUtil.isEmpty(page)) {
			page="1";
			session.setAttribute("s_department", s_department);
		}else{
			s_department=(Department) session.getAttribute("s_department");
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), 5);
		List<Department> departmentList = departmentService.findDepartmentList(s_department, pageBean);
		int total = departmentService.countDepartment(s_department);
		String pageCode = PageUtil.getPagation(request.getContextPath()+"/department/list.do", total, Integer.parseInt(page), 5);
		mav.addObject("pageCode", pageCode);
		mav.addObject("modeName", "部门管理");
		mav.addObject("departmentList", departmentList);
		mav.addObject("mainPage","department/list.jsp");
		mav.setViewName("main");
		return mav;
	}
	/**
	 * 跳至部门添加页面
	 * @return
	 */
	@RequestMapping("/preSave")
	public ModelAndView preSave(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("modeName","部门管理");
		mav.addObject("actionName","部门添加");
		mav.addObject("mainPage", "department/preSave.jsp");
		mav.setViewName("main");
		return mav;
	}
	
	/**
	 * 添加部门
	 * @param department
	 * @return
	 */
	@RequestMapping("/save")
	public String save(Department department){
		departmentService.saveDepartment(department);
		return "redirect:/department/list.do";
	}
}
