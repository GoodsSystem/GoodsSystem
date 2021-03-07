package com.newer.bean;

import java.io.Serializable;

public class CategoryFirst implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1206896114640880854L;
	private Integer firid;
	private String firname;
	public Integer getFirid() {
		return firid;
	}
	public void setFirid(Integer firid) {
		this.firid = firid;
	}
	public String getFirname() {
		return firname;
	}
	public void setFirname(String firname) {
		this.firname = firname;
	}
	
}
