package com.newer.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class CategorySlogan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3914360929618544106L;
	private Integer sloid;
	private String sloname;
	@Autowired
	private Slogan sid;
}
