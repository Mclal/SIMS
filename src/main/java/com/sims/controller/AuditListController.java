package com.sims.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sims.pojo.AuditList;
import com.sims.pojo.StudentInfo;
import com.sims.service.AuditListService;
import com.sims.service.StudentInfoService;

@Controller
@RequestMapping("/auditList")
public class AuditListController {
	@Autowired
	AuditListService auditListService;
	@Autowired
	StudentInfoService studentInfoService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<AuditList> ALs = auditListService.list();
		mav.addObject("ALs", ALs);
		mav.setViewName("admin/auditList");
		return mav;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request) {
		String no = request.getParameter("no");
		int flag = Integer.parseInt(request.getParameter("flag"));
		AuditList n = auditListService.get(no);
		n.setFlag(flag);
		auditListService.update(n);
		if(flag == 1) {
			StudentInfo s = new StudentInfo(n.getNo(), n.getName(), n.getSex(), n.getGrade(), n.getCollege(), n.getMajor(), n.getClass_(), n.getId());
			studentInfoService.update(s);
		}
		return new ModelAndView("redirect:/auditList/list");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String no = request.getParameter("no");
		auditListService.delete(no);
		return new ModelAndView("redirect:/auditList/list");
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		HttpSession session = request.getSession();
		String no = (String)session.getAttribute("account");
		StudentInfo n = studentInfoService.get(no);
		mav.addObject("n", n);
		mav.setViewName("student/editStudentInfo");
		return mav;
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String grade = request.getParameter("grade");
		String college = request.getParameter("college");
		String major = request.getParameter("major");
		String class_ = request.getParameter("class_");
		String id = request.getParameter("id");
		int flag = 0;//默认未审核
		AuditList n = new AuditList(no, name, sex, grade, college, major, class_, id, flag);
		auditListService.add(n);
		return new ModelAndView("redirect:/studentInfo/show");
	}
}
