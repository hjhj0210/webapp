package com.kedu.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kedu.member.dao.MemberDao;
import com.kedu.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao memberDao;
	
	@Override
	public List<MemberDto> selectMember() {

		return memberDao.selectMember();
	}

	@Override
	public void insertMember(MemberDto memberDto) {
		memberDao.insertMember(memberDto);
	}

	@Override
	public void deleteMember(String userid) {
		memberDao.deleteMember(userid);
	}

}
