package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.Store;
import com.newer.dao.StoreDao;
import com.newer.service.StoreService;
@Service
public class StoreServiceImpl implements StoreService{
	@Autowired
	StoreDao storeDao;
	
	
	@Override
	public List<Store> selStore() {
		
		return storeDao.selstore();
	}


	@Override
	public List<Store> noPassStore() {
		return storeDao.noPassStore();
	}


	@Override
	public Boolean delStore(int stoid) {
		return storeDao.delstore(stoid)>0?true:false;
	}


	@Override
	public Store detStore(int stoid) {
		return storeDao.detstore(stoid);
	}


	@Override
	public List<Store> fuzzyQuery(String n) {
		return storeDao.fuzzyquery(n);
	}


	@Override
	public Boolean upStore(Store store) {
		return storeDao.upstore(store)>0?true:false;
	}


	@Override
	public Boolean refuseStore(Store store) {
		
		return storeDao.refusestore(store)>0?true:false;
	}


	
}
