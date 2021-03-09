package com.newer.service;

import java.util.List;

import com.newer.bean.OrdersItem;

public interface OrdersItemService {
		
		//查询订单的总金额
		public Double money();
		//查询当天订单的总金额
		public Double daymoney();
		//查询全部订单
		public List<OrdersItem> allorders();
		//查询当天订单
		public  List<OrdersItem> dayorders();
		//查询当月订单
		public  List<OrdersItem> monthorders();
	
}
