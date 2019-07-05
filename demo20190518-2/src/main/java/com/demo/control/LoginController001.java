package com.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController001 {
	
	final static String path="demo/001/";
	
	@RequestMapping(path = "login",method = RequestMethod.GET)
	public String  ligin() {
		
		return path+"index";
	}
}
