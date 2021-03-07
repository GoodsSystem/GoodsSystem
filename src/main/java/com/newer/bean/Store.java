package com.newer.bean;

import java.io.Serializable;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;

public class Store implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3536154995761244768L;
	private Integer stoid;
	private String stoname;
	private Data stotime;
	private Integer stostate;
	private String stopeple;
	private String stophone;
	private String stoemail;
	private String stocard;
	private String stodes;
	private String stoimg;
	@Autowired
	private Users uid;
	public Integer getStoid() {
		return stoid;
	}
	public void setStoid(Integer stoid) {
		this.stoid = stoid;
	}
	public String getStoname() {
		return stoname;
	}
	public void setStoname(String stoname) {
		this.stoname = stoname;
	}
	public Data getStotime() {
		return stotime;
	}
	public void setStotime(Data stotime) {
		this.stotime = stotime;
	}
	public Integer getStostate() {
		return stostate;
	}
	public void setStostate(Integer stostate) {
		this.stostate = stostate;
	}
	public String getStopeple() {
		return stopeple;
	}
	public void setStopeple(String stopeple) {
		this.stopeple = stopeple;
	}
	public String getStophone() {
		return stophone;
	}
	public void setStophone(String stophone) {
		this.stophone = stophone;
	}
	public String getStoemail() {
		return stoemail;
	}
	public void setStoemail(String stoemail) {
		this.stoemail = stoemail;
	}
	public String getStocard() {
		return stocard;
	}
	public void setStocard(String stocard) {
		this.stocard = stocard;
	}
	public String getStodes() {
		return stodes;
	}
	public void setStodes(String stodes) {
		this.stodes = stodes;
	}
	public String getStoimg() {
		return stoimg;
	}
	public void setStoimg(String stoimg) {
		this.stoimg = stoimg;
	}
	public Users getUid() {
		return uid;
	}
	public void setUid(Users uid) {
		this.uid = uid;
	}
	
}
