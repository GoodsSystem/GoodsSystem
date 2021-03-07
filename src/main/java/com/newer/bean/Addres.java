package com.newer.bean;

import java.io.Serializable;

public class Addres implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4923601268083640271L;
	private Integer adid;
	private String addes;
	public Integer getAdid() {
		return adid;
	}
	public void setAdid(Integer adid) {
		this.adid = adid;
	}
	public String getAddes() {
		return addes;
	}
	public void setAddes(String addes) {
		this.addes = addes;
	}
	
}
