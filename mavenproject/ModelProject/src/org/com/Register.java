package org.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register 
{
	@RequestMapping("/reg") 
	public String show()
	{
		
		return "success";
	}

}
