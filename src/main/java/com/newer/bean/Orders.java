package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2113908989878634712L;
	private Integer orid;
	@Autowired
	private OrdersItem oid;
	@Autowired
	private Users uid;
	public Integer getOrid() {
		return orid;
	}
	public void setOrid(Integer orid) {
		this.orid = orid;
	}
	public OrdersItem getOid() {
		return oid;
	}
	public void setOid(OrdersItem oid) {
		this.oid = oid;
	}
	public Users getUid() {
		return uid;
	}
	public void setUid(Users uid) {
		this.uid = uid;
	}
	
}
