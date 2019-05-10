package com.kedu.member.dao;

import java.util.List;

import com.kedu.member.dto.MemberDto;

public interface MemberDao {

	public List<MemberDto> selectMember();
	public void insertMember(MemberDto memeberDto);
	public void deleteMember(String userid);
}
