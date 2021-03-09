package com.newer.bean;

import java.io.Serializable;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class OrdersItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1966271102439155790L;
	private Integer oid;
	private Integer ocount;
	private String odes;
	@Autowired
	private Orders orid;
	@Autowired
	private Goods gid;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8" )
	private Date otime;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	
	public Integer getOcount() {
		return ocount;
	}
	public void setOcount(Integer ocount) {
		this.ocount = ocount;
	}
	public String getOdes() {
		return odes;
	}
	public void setOdes(String odes) {
		this.odes = odes;
	}
	public Goods getGid() {
		return gid;
	}
	public void setGid(Goods gid) {
		this.gid = gid;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone ="GMT+8" )
	public Date getOtime() {
		return otime;
	}
	public void setOtime(Date otime) {
		this.otime = otime;
	}
	public Orders getOrid() {
		return orid;
	}
	public void setOrid(Orders orid) {
		this.orid = orid;
	}
	
}
