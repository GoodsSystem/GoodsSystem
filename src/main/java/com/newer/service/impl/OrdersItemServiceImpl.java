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
	public Integer money() {
		// TODO Auto-generated method stub
		return orderditemDao.totalmoney();
	}

	@Override
	public Integer daymoney() {
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
	
	
}
