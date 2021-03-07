package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class StoreGoods implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4870352723250724319L;
	private Integer sgid;
	@Autowired
	private Goods gid;
	@Autowired 
	private Store stoid;
	public Integer getSgid() {
		return sgid;
	}
	public void setSgid(Integer sgid) {
		this.sgid = sgid;
	}
	public Goods getGid() {
		return gid;
	}
	public void setGid(Goods gid) {
		this.gid = gid;
	}
	public Store getStoid() {
		return stoid;
	}
	public void setStoid(Store stoid) {
		this.stoid = stoid;
	}
	
}
