package com.study.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.study.test.dto.CarRegisterDTO;
import com.study.test.service.CarRegisterService;

@Controller
@RequestMapping("/register")
public class CarRegisterController {
	@Autowired
	CarRegisterService service;
	
	// 로그인
	@RequestMapping("carLoginForm")
	public String login() {
		return "register/carLoginForm";
	}
	
	@PostMapping("loginOk")
	public ModelAndView loginOk(String id, String password, HttpServletRequest request, HttpSession session) {
		//System.out.println(id);
		//System.out.println(password);
				
		CarRegisterDTO dto = service.loginOk(id, password);
		
		
		ModelAndView mav = new ModelAndView();
		
		if(dto!=null) {
			session.setAttribute("logId", dto.getId());
			session.setAttribute("logName", dto.getName());
			session.setAttribute("logStatus", "Y");
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("redirect:carLoginForm");
		}
		return mav;
	}
	// 로그아웃
	@RequestMapping("logout")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/");
		return mav;
	}
}
