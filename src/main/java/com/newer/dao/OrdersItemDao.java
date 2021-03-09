package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.newer.bean.OrdersItem;
@Mapper
public interface OrdersItemDao {
	
	//查询订单的总金额
	public Double totalmoney();
	//查询当天订单的总金额
	public Double datetotalmoney();
	//查询全部订单
	public List<OrdersItem> all();
	//查询当天订单
	public  List<OrdersItem> day();
	//查询当月订单
	public  List<OrdersItem> month();
	
}
