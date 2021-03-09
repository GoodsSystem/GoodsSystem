package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class CategorySlogan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3914360929618544106L;
	private Integer sloid;
	private String sloname;
	private Integer sid;
	@Autowired
	private Slogan slogan;
	public Integer getSloid() {
		return sloid;
	}
	public void setSloid(Integer sloid) {
		this.sloid = sloid;
	}
	public String getSloname() {
		return sloname;
	}
	public void setSloname(String sloname) {
		this.sloname = sloname;
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Slogan getSlogan() {
		return slogan;
	}
	public void setSlogan(Slogan slogan) {
		this.slogan = slogan;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
