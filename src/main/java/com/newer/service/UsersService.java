package com.newer.service;

import java.util.List;

import com.newer.bean.Users;

public interface UsersService {
	//查询用户所有数据
	public List<Users> queryAll();
	//根据ID查询用户数据
	public Users queryById(Users user);
	//更新用户状态
	public int updateState(Users users);
	//删除用户单条数据
	public int delusers(int uid);
	//修改用户数据
	public int aluser(Users user);
	//模糊查询
	public List<Users> queryLike(String n);
}
