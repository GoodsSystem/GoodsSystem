package com.newer.bean;

import java.io.Serializable;

import javax.xml.crypto.Data;

public class Slogan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8210386939027430061L;
	private Integer sid;
	private String simg;
	private String sszie;
	private String slink;
	private Data stime;
	private Integer sstate;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSimg() {
		return simg;
	}
	public void setSimg(String simg) {
		this.simg = simg;
	}
	public String getSszie() {
		return sszie;
	}
	public void setSszie(String sszie) {
		this.sszie = sszie;
	}
	public String getSlink() {
		return slink;
	}
	public void setSlink(String slink) {
		this.slink = slink;
	}
	public Data getStime() {
		return stime;
	}
	public void setStime(Data stime) {
		this.stime = stime;
	}
	public Integer getSstate() {
		return sstate;
	}
	public void setSstate(Integer sstate) {
		this.sstate = sstate;
	}
	
}
