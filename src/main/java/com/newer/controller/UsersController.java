package com.newer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	/**
	 * 根据ID查找数据
	 */
	@GetMapping("findById")
	@ResponseBody
	public Users findById(String uid) {
		
		Integer id = Integer.parseInt(uid);
		Users u = new Users();
		u.setUid(id);
		return usersService.queryById(u);
		
	}
	/**
	 * 更新用户状态码
	 */
	@GetMapping("upstate")
	@ResponseBody
	public int upstate(String uid,String state) {
		Integer id=Integer.parseInt(uid);
		Integer s=Integer.parseInt(state);
		Users u = new Users();
		u.setUid(id);
		u.setUstate(s);
		return usersService.updateState(u);
	}
	/**
	 * 删除用户单条数据
	 */
	@GetMapping("deluser")
	@ResponseBody
	public int deluser(String uid) {
		Integer id=Integer.parseInt(uid);
		return usersService.delusers(id);
	}
	/**
	 * 更新用户数据
	 */
	@PostMapping("upuser")
	public String upuser(Users user) {
		usersService.aluser(user);
		return "../static/user_list";
	}
	/**
	 * 模糊查询
	 */
	@GetMapping("dim")
	@ResponseBody
	public List<Users> dim(String n){
		
		return usersService.queryLike(n);
	}
}
