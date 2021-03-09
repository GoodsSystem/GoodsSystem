package com.newer.bean;

import java.io.Serializable;
import java.util.Date;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loid;
	private String lodes;
	private Date lotime;
	private Integer uid;
	@Autowired
	private Users user;
	public Integer getLoid() {
		return loid;
	}
	public void setLoid(Integer loid) {
		this.loid = loid;
	}
	public String getLodes() {
		return lodes;
	}
	public void setLodes(String lodes) {
		this.lodes = lodes;
	}
	
	
	
	public Date getLotime() {
		return lotime;
	}
	public void setLotime(Date lotime) {
		this.lotime = lotime;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	

}
