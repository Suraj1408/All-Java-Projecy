package com.org.serviceimplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.daoimpl.DaoImpl;
import com.org.daointerface.Dao;
import com.org.model.Student;
import com.org.serviceinterface.ServiceInterface;
@Service
public class ServicrImplimentation implements ServiceInterface
{

	@Autowired
	DaoImpl di;
	
	
	@Override
	public int registerData(Student stu) 
	{
		System.out.println("in servive impl");
		int i=di.registerData(stu);
		return i;
	}

	@Override
	public void add(Student stu) 
	{
	
		
		
		
	}

	@Override
	public List<Student> checkLogin(String username, String password) 
	{
	
		List<Student> list=di.checkLogin(username, password);
		return list;
	}

	@Override
	public List<Student> getAllData() 
	{
		
		
		List<Student> list=di.getAllData();
		return list;
	}

	@Override
	public Student edit(Student rollno) 
	{
	
		
		return null;
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int rollno) 
	{

		
		
		
	}

	
	
	
	
}
