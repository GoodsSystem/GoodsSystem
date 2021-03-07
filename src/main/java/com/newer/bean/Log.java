package com.newer.bean;

import java.io.Serializable;

import javax.xml.crypto.Data;

public class Log implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1962451487101945082L;
	private Integer lid;
	private String lname;
	private Integer lroot;
	private String ldes;
	private Data ltime;
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Integer getLroot() {
		return lroot;
	}
	public void setLroot(Integer lroot) {
		this.lroot = lroot;
	}
	public String getLdes() {
		return ldes;
	}
	public void setLdes(String ldes) {
		this.ldes = ldes;
	}
	public Data getLtime() {
		return ltime;
	}
	public void setLtime(Data ltime) {
		this.ltime = ltime;
	}
	
}
