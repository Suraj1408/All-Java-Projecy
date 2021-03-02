package com;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeServlet 
{
	
	@RequestMapping("/login/{un}/{pw}")
	public String display(@PathVariable("un") String uname,@PathVariable("pw") String pword)
	{
		
		System.out.println(uname);
		System.out.println(pword);
		System.out.println("after path");	
		
		return "success";
	}
	
	
	
	

}
