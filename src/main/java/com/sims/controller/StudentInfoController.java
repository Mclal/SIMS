package com.sims.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sims.pojo.StudentInfo;
import com.sims.service.StudentInfoService;

@Controller
@RequestMapping("/studentInfo")
public class StudentInfoController {
	@Autowired
	StudentInfoService studentInfoService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<StudentInfo> SIs = studentInfoService.list();
		mav.addObject("SIs", SIs);
		mav.setViewName("admin/studentInfoList");
		return mav;
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admin/addStudentInfo");
		return mav;
	}
	
	@RequestMapping("/findByNo")
	public ModelAndView findByNo(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		String no=request.getParameter("no");
		StudentInfo n = studentInfoService.get(no);
		mav.addObject("n", n);
		mav.setViewName("admin/editStudentInfo");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView("redirect:/studentInfo/list");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String grade = request.getParameter("grade");
		String college = request.getParameter("college");
		String major = request.getParameter("major");
		String class_ = request.getParameter("class_");
		String id = request.getParameter("id");
		StudentInfo n = new StudentInfo(no, name, sex, grade, college, major, class_, id);
		studentInfoService.add(n);
		return mav;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String no = request.getParameter("no");
		studentInfoService.delete(no);
		return new ModelAndView("redirect:/studentInfo/list");
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView("redirect:/studentInfo/list");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String grade = request.getParameter("grade");
		String college = request.getParameter("college");
		String major = request.getParameter("major");
		String class_ = request.getParameter("class");
		String id = request.getParameter("id");
		StudentInfo n = new StudentInfo(no, name, sex, grade, college, major, class_, id);
		studentInfoService.update(n);
		return mav;
	}
	
	@RequestMapping("/show")
	public ModelAndView show(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		String no = (String)session.getAttribute("account");
		StudentInfo n = studentInfoService.get(no);
		mav.addObject("n", n);
		mav.setViewName("student/showStudentInfo");
		return mav;
	}
	
}
