package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.bean.LoginLog;
import com.newer.bean.Users;

@Mapper
public interface UsersDao {

	
//	@Select("select * from users where u_name={#uname} and u_password={#upassword}")
//	用户登录
	public Users login(Users users);
	

	
	
}
