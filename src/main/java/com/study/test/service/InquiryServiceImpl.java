package com.study.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.test.dao.InquiryDAO;
import com.study.test.dto.InquiryDTO;

@Service
public class InquiryServiceImpl implements InquiryService {
	
	@Autowired(required=false)
	InquiryDAO dao;

	@Override
	public int boardInsert(InquiryDTO dto) {
		return dao.boardInsert(dto);
	}
}
