package com.enoxs.controller;

import javax.servlet.http.HttpSession;

import com.enoxs.domain.UserInfo;
import com.enoxs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

/**
 * 處理用戶請求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自動注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 處理/login請求
	 * */
	@PostMapping(value="/login")
	 public ModelAndView login(
			 String account,String password,
			 ModelAndView mv,
			 HttpSession session){
		// 根據登錄名和密碼查找用戶，判斷用戶登錄
		UserInfo user = userService.login(account, password);
		if(user != null){
			// 登錄成功，將user對象設置到HttpSession作用範圍域
			session.setAttribute("user", user);
			// 轉發到main請求
			mv.setView(new RedirectView("main"));
		}else{
			// 登錄失敗，設置失敗提示信息，並跳轉到登錄頁面
			mv.addObject("message", "登錄名或密碼錯誤，請重新輸入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	
}
