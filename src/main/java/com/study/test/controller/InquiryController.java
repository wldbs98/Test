package com.study.test.controller;


import java.nio.charset.Charset;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.study.test.dto.InquiryDTO;
import com.study.test.service.InquiryService;

@RestController
@RequestMapping("/inquiry")
public class InquiryController {
	@Autowired
	InquiryService service;
	
	@RequestMapping("inquiryWrite")
	public ModelAndView boardWrite() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("inquiry/inquiryWrite");
		return mav;
	}
	
	@RequestMapping("inquiryWriteOk")
	public ResponseEntity<String> boardWriteOk(InquiryDTO dto, HttpServletRequest request) {
		dto.setUserid((String)request.getSession().getAttribute("logId"));
		
		String htmlTag = "<script>";
		
		try {
			int result = service.boardInsert(dto);
			htmlTag += "location.href='inquiryWrite'";
		}catch(Exception e) {
			htmlTag += "alert('글이 등록되지 않았습니다.')";
			htmlTag += "history.back();";
		}
		htmlTag += "</script>";
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("text", "html", Charset.forName("UTF-8")));
		headers.add("Content-Type", "text/html; charset=UTF-8");
		
		return new ResponseEntity<String>(htmlTag, headers, HttpStatus.OK);
		
	}
}
