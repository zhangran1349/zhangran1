package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Clazz;
import com.bw.bean.Student;

public interface UserService {
	List list(Map map);
	List<Clazz> listclazz();
	Map show(int sid);
	int addstudent(Student s);
	int dels(String sid);
	int update(Student s);
}
