package com.kedu.member.dto;

public class MemberDto {
	private String userid;
	private String pwd;
	private String usernm;
	private String email;
	private String phone;
	private String admin;
	
	public MemberDto() {

	}
	
	public MemberDto(String userid, String pwd, String usernm, String email, String phone, String admin) {
		this.userid = userid;
		this.pwd = pwd;
		this.usernm = usernm;
		this.email = email;
		this.phone = phone;
		this.admin = admin;
	}
	
	public MemberDto(String userid, String pwd) {
		this.userid = userid;
		this.pwd = pwd;
	}

	public MemberDto(String userid, String pwd, String usernm, String email, String phone) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.usernm = usernm;
		this.email = email;
		this.phone = phone;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsernm() {
		return usernm;
	}
	public void setUsernm(String usernm) {
		this.usernm = usernm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "MemberDto [userid=" + userid + ", pwd=" + pwd + ", usernm=" + usernm + ", email=" + email + ", phone="
				+ phone + ", admin=" + admin + "]";
	}
	
	
}
