package com.org.serviceinterface;

import java.util.List;

import com.org.model.Student;

public interface ServiceInterface 
{
	
	public abstract int registerData(Student stu);
	public abstract void add(Student stu);
	public  List<Student> checkLogin(String username,String password);
	public List<Student> getAllData();
	public Student edit(Student rollno);
	public void update(Student stu);
	public void delete(int rollno);
	

}
