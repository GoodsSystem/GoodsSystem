package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8602178398345371644L;
	private Integer uid;
	private String uname;
	private String upassword;
	private Integer uroot;
	private String usex;
	private String uemail;
	private Integer ustate;
	private String uphone;
	
	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", uroot=" + uroot + ", usex="
				+ usex + ", uemail=" + uemail + ", ustate=" + ustate + ", uphone=" + uphone + ", addres=" + addres
				+ "]";
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	@Autowired
	private Addres addres;
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Integer getUroot() {
		return uroot;
	}
	public void setUroot(Integer uroot) {
		this.uroot = uroot;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Integer getUstate() {
		return ustate;
	}
	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}
	
	
}
