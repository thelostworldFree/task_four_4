package com.fuwei.service;

import com.fuwei.pojo.Student;
import com.fuwei.pojo.User;

import java.util.List;

public interface StudentService {

	List<Student> list();
	int count(int state);
	void update(Student s);
	void delete(Student s);
	Student get(int id);

}
