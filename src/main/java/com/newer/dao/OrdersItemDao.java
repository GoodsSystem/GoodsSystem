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
	//动态查询订单   根据状态 --成功，代发货，代付款，待收货，失败
	public List<OrdersItem> order(String state);
	//删除二个表中的数据
	public int del(int id);
	//修改状态 --发货
	public int amend(int id);
}
