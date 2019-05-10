package com.kedu.member.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kedu.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Inject
	private SqlSession session;
	
	private final static String ns = "com.kedu.mappers.MemberMapper";
	
	@Override
	public List<MemberDto> selectMember() {
		return session.selectList(ns + ".selectMember");
	}

	@Override
	public void insertMember(MemberDto memberDto) {
		session.insert(ns + ".insertMember", memberDto);
	}

	@Override
	public void deleteMember(String userid) {
		session.insert(ns + ".deleteMember", userid);
	}

}
