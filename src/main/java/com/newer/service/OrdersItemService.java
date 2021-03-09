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
		//动态查询订单   根据状态 --成功，代发货，代付款，待收货，失败
		public List<OrdersItem> implorder(String state);
		//删除二个表中的数据
		public boolean del(int id);
		//修改状态
		public boolean amend(int id);
		
}
