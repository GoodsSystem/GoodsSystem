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
	@Select("select sum(or_price) from orders")
	public Double totalPrice();
	
	//未处理订单数
	@Select("select count(or_id) from orders where or_state='待收货'")
	public Integer unOrders();
		
	//待发货订单数
	@Select("select count(or_id) from orders where or_state='待发货'")
	public Integer droOrders();
			
	//待结算订单数
	@Select("select count(or_id) from orders where or_state='代付款'")
	public Integer forOrders();
			
	//已成交订单数
	@Select("select count(or_id) from orders where or_state='成功'")
	public Integer makeOrders();
			
	//交易失败订单数
	@Select("select count(or_id) from orders where or_state='失败'")
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
