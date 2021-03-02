package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;


@Controller
public class HomeController 
{
	//DispatcherServlet
     @RequestMapping("/login")
	public String display(@RequestParam("username")String uname,@RequestParam("password")String pass,Model m)
	{
		
    	 System.out.println(uname);
    	 System.out.println(pass);
    	 m.addAttribut("data",uname);
    	 m.addAttribut("data",pass);
		return "success";
	}
	

}
