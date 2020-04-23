package com.demo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.demo.exception.BusinessException;

//@Component
public class MyExceptionResolver implements HandlerExceptionResolver {

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		
		
		ModelAndView modelAndView =new ModelAndView();
		if(ex instanceof BusinessException) {
			modelAndView.setViewName("common/error");
		}else {
			modelAndView.setViewName("common/error");
		}
		
		modelAndView.addObject("errorMsg", ex.getMessage());
		return modelAndView;
	}

}