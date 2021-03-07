package com.newer.bean;

import java.io.Serializable;

public class Goods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1572833621141706932L;
	private Integer gid;
	private String gname;
	private String gimg;
	private Double gprice;
	private String gspe;
	private Integer gstate;
	private String gdes;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGimg() {
		return gimg;
	}
	public void setGimg(String gimg) {
		this.gimg = gimg;
	}
	public Double getGprice() {
		return gprice;
	}
	public void setGprice(Double gprice) {
		this.gprice = gprice;
	}
	public String getGspe() {
		return gspe;
	}
	public void setGspe(String gspe) {
		this.gspe = gspe;
	}
	public Integer getGstate() {
		return gstate;
	}
	public void setGstate(Integer gstate) {
		this.gstate = gstate;
	}
	public String getGdes() {
		return gdes;
	}
	public void setGdes(String gdes) {
		this.gdes = gdes;
	}
	
}
