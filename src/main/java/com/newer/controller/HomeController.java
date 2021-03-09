package com.newer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;
	
	@GetMapping("all")
	@ResponseBody
	public List<Object> allUsers() {
		List<Object> list=new ArrayList<>();
		Integer usersNum=homeService.usersNum();
		Integer orderNum=homeService.orderNum();
		Double totalPrice=homeService.totalPrice();
		if(totalPrice==null) {
			totalPrice=0.00;
		}
		Integer unOrders=homeService.unOrders();
		Integer droOrders=homeService.droOrders();
		Integer forOrders=homeService.forOrders();
		Integer makeOrders=homeService.makeOrders();
		Integer failOrders=homeService.failOrders();
		Integer goodsNum=homeService.goodsNum();
		Integer recGoodsNum=homeService.recGoodsNum();
		Integer putGoodsNum=homeService.putGoodsNum();
		Integer outGoodsNum=homeService.outGoodsNum();
		list.add(usersNum);
		list.add(orderNum);
		list.add(totalPrice);
		list.add(unOrders);
		list.add(droOrders);
		list.add(forOrders);
		list.add(makeOrders);
		list.add(failOrders);
		list.add(goodsNum);
		list.add(recGoodsNum);
		list.add(putGoodsNum);
		list.add(outGoodsNum);
		return list;
	}
		
}
