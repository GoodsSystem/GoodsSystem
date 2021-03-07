package com.newer.bean;

import java.io.Serializable;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;

public class OrdersItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1966271102439155790L;
	private Integer oid;
	private Integer onum;
	private Data otime;
	private Double oprice;
	private Integer ostate;
	private Integer ocount;
	private String odes;
	@Autowired
	private Goods gid;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getOnum() {
		return onum;
	}
	public void setOnum(Integer onum) {
		this.onum = onum;
	}
	public Data getOtime() {
		return otime;
	}
	public void setOtime(Data otime) {
		this.otime = otime;
	}
	public Double getOprice() {
		return oprice;
	}
	public void setOprice(Double oprice) {
		this.oprice = oprice;
	}
	public Integer getOstate() {
		return ostate;
	}
	public void setOstate(Integer ostate) {
		this.ostate = ostate;
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
	
}
