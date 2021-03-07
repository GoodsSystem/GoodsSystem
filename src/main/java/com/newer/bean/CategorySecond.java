package com.newer.bean;

import java.io.Serializable;

public class CategorySecond implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5953250540811838572L;
	private Integer sceid;
	private String scename;
	public Integer getSceid() {
		return sceid;
	}
	public void setSceid(Integer sceid) {
		this.sceid = sceid;
	}
	public String getScename() {
		return scename;
	}
	public void setScename(String scename) {
		this.scename = scename;
	}
	
}
