package com.newer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newer.bean.Users;


public interface UsersService {

	
//	用户登录
	public Users userslogin(Users u);
//	查询所有用户信息
	public List<Users> usersserch();
//	通过ID查询当前用户
	public Users usersearch(int uid);
//	修改用户数据
	public boolean change(Users u);
//	验证密码
	public Users verpwd(Users u);
	
//	修改密码
	public boolean changepwd(Users u);
//	修改状态码
	public Boolean changes(Users u);
	
}
