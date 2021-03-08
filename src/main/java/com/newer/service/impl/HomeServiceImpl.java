package com.newer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.dao.HomeDao;
import com.newer.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeDao homeDao;

	@Override
	//查询用户数量
	public Integer allusers() {
		return homeDao.usersNum();
	}

	@Override
	//查询订单数量
	public Integer orderNum() {
		return homeDao.orderNum();
	}

	@Override
	//查询交易金额
	public Double totalPrice() {
		return homeDao.totalPrice();
	}

	@Override
	//未处理订单数
	public Integer unOrders() {
		return homeDao.unOrders();
	}

	@Override
	//待发货订单数
	public Integer droOrders() {
		return homeDao.droOrders();
	}

	@Override
	//待结算订单数
	public Integer forOrders() {
		return homeDao.forOrders();
	}

	@Override
	//已成交订单数
	public Integer makeOrders() {
		return homeDao.makeOrders();
	}

	@Override
	//交易失败订单数
	public Integer failOrders() {
		return homeDao.failOrders();
	}

	@Override
	//商品总数
	public Integer goodsNum() {
		return homeDao.goodsNum();
	}

	@Override
	//回收站商品
	public Integer recGoodsNum() {
		return homeDao.recGoodsNum();
	}

	@Override
	//上架站商品
	public Integer putGoodsNum() {
		return homeDao.putGoodsNum();
	}

	@Override
	//下架站商品
	public Integer outGoodsNum() {
		return homeDao.outGoodsNum();
	}

}
