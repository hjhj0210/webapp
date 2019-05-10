package com.kedu.member.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kedu.member.dto.MemberDto;
import com.kedu.member.service.MemberService;

@Controller 
public class MemberController {
 
	@Inject
	private MemberService service;
	
	@RequestMapping(value="/memberListForm", method=RequestMethod.GET)
	public String selectMemberForm(Model model) {  
	  return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/memberList", method=RequestMethod.GET)
	public List<MemberDto> selectMember() {  
	   List<MemberDto> memberDto = service.selectMember();
		
		return memberDto;
	}
	
	@ResponseBody    /*이게 걸리면 string이 넘어가지않고 끝*/
	@RequestMapping(value="/insertMember", method=RequestMethod.POST)
	public String insertMember(MemberDto memberDto) {
		service.insertMember(memberDto);
		
		String result ="1";
		return result;
	}
	
	@ResponseBody    /*이게 걸리면 string이 넘어가지않고 끝*/
	@RequestMapping(value="/deleteMember", method=RequestMethod.POST)
	public String deleteMember(@RequestParam("userid")String userid) {
		
		service.deleteMember(userid);
		
		String result ="1";
		return result;
	}
	
	
}








