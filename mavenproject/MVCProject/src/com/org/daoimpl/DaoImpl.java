package com.org.daoimpl;

import java.util.List;

import com.org.daointerface.Dao;
import com.org.model.Student;

public class DaoImpl implements Dao
{

	@Override
	public int registerData(Student stu)
	{
		
		return 0;
	}

	@Override
	public void add(Student stu)
	{
		
		
	}

	@Override
	public List<Student> checkLogin(String username, String password) 
	{
		
		return null;
	}

	@Override
	public List<Student> getAllData() 
	{
		
		return null;
	}

	@Override
	public Student edit(Student rollno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int rollno) {
		// TODO Auto-generated method stub
		
	}
	

}
