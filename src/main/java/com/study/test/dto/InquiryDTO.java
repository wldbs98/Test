package com.study.test.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InquiryDTO {
	private int no;
	private String username;
	private String userid;
	private String email;
	private String category;
	private String subject;
	private String content;
	private String writedate;
}
// 1:1문의게시판 DTO입니다.
