package com.bw.service;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Clazz;
import com.bw.bean.Student;
import com.bw.dao.UserDAO;

@Service
public class UserServicelmpl implements UserService{

	@Resource
	private UserDAO ud;
	
	@Override
	public List list(Map map) {
		
		return ud.list(map);
	}

	@Override
	public List<Clazz> listclazz() {

		return ud.listclazz();
	}

	@Override
	public int addstudent(Student s) {

		return ud.addstudent(s);
	}

	@Override
	public int dels(String sid) {
		
		return ud.dels(sid);
	}

	@Override
	public Map show(int sid) {
		
		return ud.show(sid);
	}

	@Override
	public int update(Student s) {
	
		return ud.update(s);
	}

}
