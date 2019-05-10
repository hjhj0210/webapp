package com.test.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.controller.MemberDto;
import com.test.dao.MemberDao;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao dao;
	
	@Override
	public List<MemberDto> selectMember() throws Exception {
		return dao.selectMember();
	}
	
}
