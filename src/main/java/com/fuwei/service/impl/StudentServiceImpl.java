package com.fuwei.service.impl;

import com.fuwei.mapper.StudentMapper;
import com.fuwei.pojo.Student;
import com.fuwei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;

	
	
	public List<Student> list(){
		return studentMapper.list();
	}



	@Override
	public int count(int state) {
		return studentMapper.count(state);

	}




	@Override
	public void update(Student s) {
		studentMapper.update(s);
	}


	@Override
	public void delete(Student s) {
		studentMapper.delete(s.getId());
	}


	@Override
	public Student get(int id) {
		// TODO Auto-generated method stub
		return studentMapper.get(id);
	};

}
