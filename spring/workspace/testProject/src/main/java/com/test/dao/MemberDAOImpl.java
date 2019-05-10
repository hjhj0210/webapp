package com.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.controller.MemberDto;

@Repository
public class MemberDAOImpl implements MemberDao{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace= 
			"com.test.mappers.testMapper";

	@Override
	public List<MemberDto> selectMember() throws Exception{
		return session.selectList(namespace +".selectMember");
	}
}
