package com.enoxs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 頁面跳轉控制器
 * */
@Controller
public class FormController{//http://localhost:8081/loginForm
	@RequestMapping(value="/loginForm")
	 public String loginForm(){
		// 跳轉頁面
		return "loginForm";
	}

}

