package com.newer.service;

public interface HomeService {
	//查寻所有用户
	public Integer allusers();
	
	//查询订单数量
	public Integer orderNum();
	
	//查询交易金额
	public Double totalPrice();
	
	//未处理订单数
	public Integer unOrders();
	
	//待发货订单数
	public Integer droOrders();
	
	//待结算订单数
	public Integer forOrders();
	
	//已成交订单数
	public Integer makeOrders();
	
	//交易失败订单数
	public Integer failOrders();
	
	//商品总数
	public Integer goodsNum();
	
	//回收站商品
	public Integer recGoodsNum();
	
	//上架站商品
	public Integer putGoodsNum();
	
	//下架站商品
	public Integer outGoodsNum();

}
