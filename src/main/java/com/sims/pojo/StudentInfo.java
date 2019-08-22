package com.sims.pojo;

public class StudentInfo {
	private String no;
	private String name;
	private String sex;
	private String grade;
	private String college;
	private String major;
	private String class_;
	private String id;
	public StudentInfo(String no, String name, String sex, String grade, String college, String major, String class_,
			String id) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
		this.college = college;
		this.major = major;
		this.class_ = class_;
		this.id = id;
	}
	public StudentInfo(){}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getClass_() {
		return class_;
	}
	public void setClass_(String class_) {
		this.class_ = class_;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
