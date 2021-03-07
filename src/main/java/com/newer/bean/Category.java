package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6822051743168676321L;
	private Integer cid;
	@Autowired
	private CategorySecond sceid;
	@Autowired
	private CategoryFirst firid;
	@Autowired
	private Goods gid;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public CategorySecond getSceid() {
		return sceid;
	}
	public void setSceid(CategorySecond sceid) {
		this.sceid = sceid;
	}
	public CategoryFirst getFirid() {
		return firid;
	}
	public void setFirid(CategoryFirst firid) {
		this.firid = firid;
	}
	public Goods getGid() {
		return gid;
	}
	public void setGid(Goods gid) {
		this.gid = gid;
	}
	
}
