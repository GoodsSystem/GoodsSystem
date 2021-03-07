package com.newer.bean;

import java.io.Serializable;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer loid;
	private String lodes;
	private Data lotime;
	@Autowired
	private Users uid;
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
	public Data getLotime() {
		return lotime;
	}
	public void setLotime(Data lotime) {
		this.lotime = lotime;
	}
	public Users getUid() {
		return uid;
	}
	public void setUid(Users uid) {
		this.uid = uid;
	}
	

}
