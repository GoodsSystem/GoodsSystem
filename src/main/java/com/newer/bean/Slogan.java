package com.newer.bean;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Slogan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8210386939027430061L;
	private Integer sid;
	private String simg;
	private String sszie;
	private String slink;
	private Date stime;
	@Override
	public String toString() {
		return "Slogan [sid=" + sid + ", simg=" + simg + ", sszie=" + sszie + ", slink=" + slink + ", stime=" + stime
				+ ", sstate=" + sstate + ", sdf=" + sdf + ", creatTimeStr=" + creatTimeStr + ", categorySlogan="
				+ categorySlogan + "]";
	}
	private Integer sstate;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化时间
	private String creatTimeStr;
	private CategorySlogan categorySlogan;
	
	public CategorySlogan getCategorySlogan() {
		return categorySlogan;
	}
	public void setCategorySlogan(CategorySlogan categorySlogan) {
		this.categorySlogan = categorySlogan;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
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

	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
		String time = sdf.format(stime);
        setCreatTimeStr(time);
	}
	public String getCreatTimeStr() {
		return creatTimeStr;
	}
	public void setCreatTimeStr(String creatTimeStr) {
		this.creatTimeStr = creatTimeStr;
	}
	public Integer getSstate() {
		return sstate;
	}
	public void setSstate(Integer sstate) {
		this.sstate = sstate;
	}
	
}
