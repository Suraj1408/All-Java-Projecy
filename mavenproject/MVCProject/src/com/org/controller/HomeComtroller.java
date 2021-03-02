package com.org.controller;

import java.util.List;

import org.hibernate.dialect.MySQL55Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;

import com.org.model.Student;
import com.org.serviceinterface.ServiceInterface;


@Controller
public class HomeComtroller 
{
	
	
	//DispatcherServlet
	
	@Autowired
	ServiceInterface si;
	

	@RequestMapping("/register")
	 public String register()
    {
   	 return "registration";
   	
    }
	
	@RequestMapping(value="/reg")
     public String registration(@ModelAttribute Student stu,Model m)
     {    	 
    	 System.out.println("in controlller class"+stu);
    	int i= si.registerData(stu);
    	
    	 return "login";
     }
	
	@RequestMapping("/login")
	public String checklogin(@RequestParam("username")String uname,@RequestParam("password")String pword,Model m)
	{
		//si.checkLogin(uname, pword);
		
		System.out.println(uname);
		System.out.println(pword);
		
		
		if(uname.equals("admin") && pword.equals("admin"))
		{
			List<Student> list=si.getAllData();
			
			m.addAttribute("data",list);
			
			return "success";
		}
		else
		{
			return "login";
		}
	}
	
	
	public String getData(@ModelAttribute Student s,Model m)
	{  
		
		List<Student> list=si.getAllData();
		m.addAttribute("data",list);
		
		return "success";
		
	}
	
	//public String delete()
	

}
