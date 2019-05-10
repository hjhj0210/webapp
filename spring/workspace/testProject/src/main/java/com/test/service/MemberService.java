package com.test.service;

import java.util.List;

import com.test.controller.MemberDto;

public interface MemberService {

	public List<MemberDto> selectMember() throws Exception;
}
