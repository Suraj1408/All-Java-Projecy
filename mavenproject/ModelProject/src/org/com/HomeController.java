package org.com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class HomeController 
{

	
	@RequestMapping("/login")
	public String display(@RequestParam("un")String username,Model m)
	{
	     m.addAttribute("data",username);
		
		
		return "success";
	}
	
	
	
}
