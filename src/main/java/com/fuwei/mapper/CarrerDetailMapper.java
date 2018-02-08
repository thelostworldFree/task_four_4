package com.fuwei.mapper;

import com.fuwei.pojo.CarrerDetail;

import java.util.List;

public interface CarrerDetailMapper {
 
      
    public int add1(CarrerDetail carrerDetail);

      
    public void delete1(int cid);
       
      
    public CarrerDetail get1(int cid);
     
      
    public int update1(CarrerDetail carrerDetail);
       
      
    public List<CarrerDetail> list1(String carrerDetail);
    

    
    
    
}