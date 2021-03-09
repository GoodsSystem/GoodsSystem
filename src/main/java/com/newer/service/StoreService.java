package com.newer.service;

import java.util.List;

import com.newer.bean.Store;

public interface StoreService {
	public List<Store> selStore();
	
	public List<Store> noPassStore();
	
	public Boolean delStore(int stoid);
	
	public Store detStore(int stoid);
	
	public List<Store> fuzzyQuery(String n);

	public Boolean upStore(Store store);
	
	public Boolean refuseStore(Store store);
}
