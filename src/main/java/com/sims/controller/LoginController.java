package com.sims.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sims.pojo.AdministratorAccount;
import com.sims.pojo.StudentAccount;
import com.sims.service.AdministratorAccountService;
import com.sims.service.StudentAccountService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	StudentAccountService studentAccountService;
	@Autowired
	AdministratorAccountService administratorAccountService;
	
	@RequestMapping("/form")
	public ModelAndView form(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("account");
		return new ModelAndView("login/login");
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String Radio = request.getParameter("Radio");
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		if(Radio.equals("student")) {
			StudentAccount studentAccount = studentAccountService.get(account);
			if(studentAccount != null && studentAccount.getPassword().equals(password)) {
				mav.setViewName("index/student");
				HttpSession session = request.getSession();
				session.setAttribute("account", account);
			}
			else
				mav.addObject("message", "账号或密码错误");
		}else if(Radio.equals("admin")) {
			AdministratorAccount adminAccount = administratorAccountService.get(account);
			if(adminAccount != null &&adminAccount.getPassword().equals(password)) {
				mav.setViewName("index/admin");
				HttpSession session = request.getSession();
				session.setAttribute("account", account);
			}
			else
				mav.addObject("message", "账号或密码错误");
		}
		return mav;
	}
}
