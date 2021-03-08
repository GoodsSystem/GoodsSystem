package com.newer.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface HomeDao {
	//查询用户数量
	@Select("select count(u_id) from users")
	public Integer usersNum();
	
	//查询订单数量
	@Select("select count(or_id) from orders")
	public Integer orderNum();
	
	//查询交易金额
	@Select("select sum(o.o_price) from orders ord,orders_item o where ord.o_id=o.o_id and ord.or_state=4")
	public Double totalPrice();
	
	//未处理订单数
	@Select("select count(or_id) from orders where or_state=1")
	public Integer unOrders();
	
	//待发货订单数
	@Select("select count(or_id) from orders where or_state=2")
	public Integer droOrders();
		
	//待结算订单数
	@Select("select count(or_id) from orders where or_state=3")
	public Integer forOrders();
		
	//已成交订单数
	@Select("select count(or_id) from orders where or_state=4")
	public Integer makeOrders();
		
	//交易失败订单数
	@Select("select count(or_id) from orders where or_state=0")
	public Integer failOrders();
	
	//商品总数
	@Select("select count(g_id) from goods")
	public Integer goodsNum();
	
	//回收站商品
	@Select("select count(g_id) from goods where g_state=0")
	public Integer recGoodsNum();
	
	//上架站商品
	@Select("select count(g_id) from goods where g_state=1")
	public Integer putGoodsNum();
	
	//下架站商品
	@Select("select count(g_id) from goods where g_state=2")
	public Integer outGoodsNum();
	

}
