package com.newer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.bean.OrdersItem;
import com.newer.service.OrdersItemService;

@Controller
@RestController
public class OrdersItemController {
	
	@Autowired
	OrdersItemService ordersitemService;
	
	@PostMapping("totalmoney")
	public Integer totalmoney() {
		Integer money= ordersitemService.money();
		return money;		
	}
	@PostMapping("datetotalmoney")
	public Integer datetotalmoney() {
		Integer money=ordersitemService.daymoney();
		return money;
	}
	@PostMapping("all")
	public List<OrdersItem> all(){
		List<OrdersItem> list=ordersitemService.allorders();
		return list;	
	}
	@PostMapping("day")
	public List<OrdersItem> day(){
		List<OrdersItem> list=ordersitemService.dayorders();
		return list;	
	}
	@PostMapping("month")
	public List<OrdersItem> month(){
		List<OrdersItem> list=ordersitemService.monthorders();
		return list;	
	}
		
}
