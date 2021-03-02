package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController 
{
	
	@RequestMapping("/log")
	public String display(@RequestParam("username")String uname,@RequestParam("password") String pword)
	{
		System.out.println(uname);
			System.out.println(pword);
		return "success";
		
		
	}

}
