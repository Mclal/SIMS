package com.sims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sims.pojo.StudentAccount;
import com.sims.service.StudentAccountService;

@Controller
@RequestMapping("/studentAccount")
public class StudentAccountController {
	@Autowired
	StudentAccountService studentAccountService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<StudentAccount> SAs = studentAccountService.list();
		mav.addObject("SAs", SAs);
		mav.setViewName("admin/studentAccountList");
		return mav;
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/addStudentAccount");
		return mav;
	}
	
	@RequestMapping("/findByAccount")
	public ModelAndView findByAccount(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String account=request.getParameter("account");
		StudentAccount n = studentAccountService.get(account);
		mav.addObject("n", n);
		mav.setViewName("/admin/editStudentAccount");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request) {
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		StudentAccount n =new StudentAccount(account, password);
		studentAccountService.add(n);
		return new ModelAndView("redirect:/studentAccount/list");
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		StudentAccount n =new StudentAccount(account, password);
		studentAccountService.update(n);
		return new ModelAndView("redirect:/studentAccount/list");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request) {
		String account=request.getParameter("account");
		studentAccountService.delete(account);
		return new ModelAndView("redirect:/studentAccount/list");
	}
}
