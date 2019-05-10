package com.kedu.member.service;

import java.util.List;

import com.kedu.member.dto.MemberDto;

public interface MemberService {

	public List<MemberDto> selectMember();
	public void insertMember(MemberDto memberDto);
	public void deleteMember(String userid);
}
