package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.UserInfoMapper;
import com.demo.exception.BusinessException;
import com.demo.model.UserInfo;
import com.demo.model.UserInfoExample;
import com.demo.util.DateUtil;

@Controller
@RequestMapping(value = "user/")
public class DemoController001 {

final static String path="demo/001/";
	
	@Autowired
	private UserInfoMapper userInfoMaper;
	
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public String  index(
			) {
		
		return path+"index";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String  add(
			) {
		
		return path+"add";
	}
	
	@RequestMapping(value = "doadd",method = RequestMethod.POST)
	@ResponseBody
	public String  doadd(
			@RequestParam(value = "userName",required = true) String userName,
			@RequestParam(value = "password",required = true) String password
			) throws BusinessException {
		
		
		
		
		UserInfo info =new UserInfo();
		info.setUserName(userName);
		info.setPassword(password);
		info.setCreatTime(DateUtil.getDateAndTime());
		info.setLstUpdateTime(DateUtil.getDateAndTime());
		
		int result= 0;//userInfoMaper.insert(info);
		if(result==0) {
			throw new BusinessException("doadd   失败");
		}
		
		return "success";
		
	}
	
	
	@RequestMapping(value = "list",method = RequestMethod.POST)
	public ModelAndView  list(
			@RequestParam(value = "userName",required = false) String userName,
			@RequestParam(value = "password",required = false) String password,
			ModelAndView modelAndView
			) {
		UserInfoExample example =new UserInfoExample();
		
//		example.createCriteria().andUserNameEqualTo(userName).andPasswordEqualTo(password);
		List<UserInfo>  list = userInfoMaper.selectByExample(example);
		modelAndView.addObject("list", list);
		modelAndView.setViewName(path+"list");
		return modelAndView;
	}
}
