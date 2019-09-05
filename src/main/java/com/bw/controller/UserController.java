package com.bw.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.aspectj.weaver.MemberImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Clazz;
import com.bw.bean.Student;
import com.bw.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService us;
	
	@RequestMapping("list.do")
	public String list(Model model,String sname){
		Map map = new HashMap();//测试
		map.put("sname", sname);//测试1
		List list = us.list(map);
		model.addAttribute("list", list);
		model.addAttribute("map", map);
		return "list";
	}
	
	@RequestMapping("listclazz.do")
	@ResponseBody
	public Object listclazz(){
		List<Clazz> list = us.listclazz();
		return list;
	}
	
	@RequestMapping("toadd.do")
	public Object toadd(){

		return "add";
	}
	
	@RequestMapping("add.do")
	public Object studentadd(Student s){
		us.addstudent(s);
		return "redirect:list.do";
	}
	
	@RequestMapping("dels.do")
	@ResponseBody
	public Object dels(String sid){
		int i = us.dels(sid);
		return i;
	}
	
	@RequestMapping("toupdate.do")
	public Object toupdate(){
		return "update";
	}
	
	@RequestMapping("show.do")
	@ResponseBody
	public Object show(int sid){
		Map show = us.show(sid);
		return show;
	}
	
	@RequestMapping("update.do")
	public Object update(Student s){
		int i = us.update(s);
		if(i>0){
			return "redirect:list.do";
		}else{
			return "error";
		}
	}
}
