package com.fuwei.mapper;

import com.fuwei.pojo.Student;

import java.util.List;

public interface StudentMapper {
 
      
    public int register(Student student);

      
    public void delete(int id);  
       
      
    public Student get(int id);
     
      
    public int update(Student student);
       
      
    public List<Student> list();

    public int count(int state);

    

    
    
    
}