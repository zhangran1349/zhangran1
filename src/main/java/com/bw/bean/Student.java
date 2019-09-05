package com.bw.bean;

public class Student {
	private int sid;
	private String sname;
	private String age;
	private String sex;
	private Clazz clazz;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Clazz getClazz() {
		return clazz;
	}
	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}
	public Student(int sid, String sname, String age, String sex, Clazz clazz) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.clazz = clazz;
	}
	public Student(String sname, String age, String sex, Clazz clazz) {
		super();
		this.sname = sname;
		this.age = age;
		this.sex = sex;
		this.clazz = clazz;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + ", sex=" + sex + ", clazz=" + clazz + "]";
	}
	
}
