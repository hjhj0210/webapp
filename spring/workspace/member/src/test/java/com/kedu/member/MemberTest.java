package com.kedu.member;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kedu.member.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberTest {
	@Inject
	private DataSource ds;
	
	@Inject 
	private SqlSessionFactory sqlFactory;
	
	@Inject
	private SqlSession session;
	
	@Inject
	private MemberService memberService;
	
	@Test
	public void connectionTest() throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println("Connection Test==>" + con);
		}catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	@Test
	public void selectMember() throws Exception{
		System.out.println("select Member =>" + memberService.selectMember());
	}
}












