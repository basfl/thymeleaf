package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	@RequestMapping(value = "/hello",method=RequestMethod.GET)
	public String helloForm(){
		return "helloform";
		
	}
	@RequestMapping(value = "/hello",method=RequestMethod.POST)
	public String hello(HttpServletRequest request,Model model) {
		String n = request.getParameter("name");
		model.addAttribute("message", n);
		return "hello";

	}

}
