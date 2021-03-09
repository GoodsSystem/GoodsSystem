package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.bean.Users;

@Mapper
public interface UsersDao {

	//用户查询方法
	public List<Users> login();
	//根据ID查询用户
	public Users findbyid(Users user);
	//状态码更新
	public int up(Users users);
	//删除一条数据
	@Delete("delete from users where u_id = #{uid}")
	public int delUser(int uid);
	//修改用户数据
	public int upuser(Users user);
	//模糊查询数据
	public List<Users> mohu(String n);
}
