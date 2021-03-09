package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.OrdersItem;
import com.newer.dao.OrdersItemDao;
import com.newer.service.OrdersItemService;

@Service
public class OrdersItemServiceImpl implements OrdersItemService{
	@Autowired
	OrdersItemDao orderditemDao;

	@Override
	public Double money() {
		// TODO Auto-generated method stub
		return orderditemDao.totalmoney();
	}

	@Override
	public Double daymoney() {
		// TODO Auto-generated method stub
		return orderditemDao.datetotalmoney();
	}

	@Override
	public List<OrdersItem> allorders() {
		
		return orderditemDao.all();
	}

	@Override
	public List<OrdersItem> dayorders() {
		// TODO Auto-generated method stub
		return orderditemDao.day();
	}

	@Override
	public List<OrdersItem> monthorders() {
		// TODO Auto-generated method stub
		return orderditemDao.month();
	}

	@Override
	public List<OrdersItem> implorder(String state) {
		if(state.equals("null")) {
			state=null;
		}
		return orderditemDao.order(state);
	}

	@Override
	public boolean del(int id) {
		return orderditemDao.del(id)>0 ?true:false;
	}

	@Override
	public boolean amend(int id) {
		// TODO Auto-generated method stub
		return orderditemDao.amend(id)>0?true:false;
	}
	
	
}
