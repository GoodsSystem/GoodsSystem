package com.newer.service;

import java.util.List;

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

//--------------------------------------
	// 查询用户所有数据
	public List<Users> queryAll();

	// 根据ID查询用户数据
	public Users queryById(Users user);

	// 更新用户状态
	public int updateState(Users users);

	// 删除用户单条数据
	public int delusers(int uid);

	// 修改用户数据
	public int aluser(Users user);

	// 模糊查询
	public List<Users> queryLike(String n);
}
