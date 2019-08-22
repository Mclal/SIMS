package com.sims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sims.pojo.AdministratorAccount;
import com.sims.service.AdministratorAccountService;

@Controller
@RequestMapping("/adminAccount")
public class AdministratorAccountController {
	@Autowired
	AdministratorAccountService administratorAccountService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<AdministratorAccount> AAs = administratorAccountService.list();
		mav.addObject("AAs", AAs);
		mav.setViewName("admin/adminAccountList");
		return mav;
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/addAdminAccount");
		return mav;
	}
	
	@RequestMapping("/findByAccount")
	public ModelAndView findByAccount(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String account=request.getParameter("account");
		AdministratorAccount n = administratorAccountService.get(account);
		mav.addObject("n", n);
		mav.setViewName("/admin/editAdminAccount");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request) {
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		AdministratorAccount n =new AdministratorAccount(account, password);
		administratorAccountService.add(n);
		return new ModelAndView("redirect:/adminAccount/list");
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		String account=request.getParameter("account");
		String password=request.getParameter("password");
		AdministratorAccount n =new AdministratorAccount(account, password);
		administratorAccountService.update(n);
		return new ModelAndView("redirect:/adminAccount/list");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request) {
		String account=request.getParameter("account");
		administratorAccountService.delete(account);
		return new ModelAndView("redirect:/adminAccount/list");
	}
}
