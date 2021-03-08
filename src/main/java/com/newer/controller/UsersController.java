package com.newer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newer.bean.Users;
import com.newer.service.UsersService;

@Controller
public class UsersController {
	//获取service层对象
		@Autowired
		UsersService usersService; 
	/**
	 * 接收用户数据
	 * @param md
	 * @return
	 */
	@GetMapping("list")
	@ResponseBody
	public List<Users> login() {
//		List<Users> list = new ArrayList<>();
//		usersService.queryAll();
		return usersService.queryAll();
	}
}
