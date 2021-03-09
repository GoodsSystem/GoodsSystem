package com.newer.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;

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
	private String stoTime;
	private Integer stostate;
	private String stopeple;
	private String stophone;
	private String stoemail;
	private String stocard;
	private String stodes;
	private String stoimg;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化时间
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
		String time = sdf.format(stotime);
        setCreatTimeStr(time);
	}
	private void setCreatTimeStr(String stoTime) {
		this.stoTime=stoTime;
		
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
