package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2113908989878634712L;
	private Integer orid;
	private String orstate;
	private Integer ornum;
	private double orprice;
	@Autowired
	private Users uid;
	public Integer getOrid() {
		return orid;
	}
	public void setOrid(Integer orid) {
		this.orid = orid;
	}
	public Users getUid() {
		return uid;
	}
	public void setUid(Users uid) {
		this.uid = uid;
	}
	public String getOrstate() {
		return orstate;
	}
	public void setOrstate(String orstate) {
		this.orstate = orstate;
	}
	public Integer getOrnum() {
		return ornum;
	}
	public void setOrnum(Integer ornum) {
		this.ornum = ornum;
	}
	public double getOrprice() {
		return orprice;
	}
	public void setOrprice(double orprice) {
		this.orprice = orprice;
	}
	
}
