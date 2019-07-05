package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dao.UserInfoMapper;
import com.demo.model.UserInfo;
import com.demo.model.UserInfoExample;

@Controller
public class LoginController001 {
	
	final static String path="login/001/";
	
	@Autowired
	private UserInfoMapper userInfoMaper;
	
	
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String  login(
			) {
		
		return path+"login";
	}
	
	@RequestMapping(value = "dologin",method = RequestMethod.POST)
	public String  dologin(
			@RequestParam(value = "userName",required = true) String userName,
			@RequestParam(value = "password",required = true) String password
			) {
		
		UserInfoExample example =new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
		
		List<UserInfo> userInfos = userInfoMaper.selectByExample(example);
		if(userInfos==null|userInfos.size()==0) {
			return "common/error";
		}
		return path+"index";
	}
}
