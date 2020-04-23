package com.demo.common;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.exception.BusinessException;

@ControllerAdvice
public class MyControllerAdvice {

	
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public String handleHttpMediaTypeNotSupportedException(Exception e) {
        return "{'errorMsg':'"+e.getMessage()+"'}";
    }
}