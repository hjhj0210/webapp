package com.test.dao;

import java.util.List;

import com.test.controller.MemberDto;

public interface MemberDao {
	public List<MemberDto> selectMember() throws Exception;
}
