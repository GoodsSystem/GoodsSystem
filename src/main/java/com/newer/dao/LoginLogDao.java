package com.newer.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.newer.bean.LoginLog;

@Mapper
public interface LoginLogDao {

	
//	登录信息存储
	@Insert("insert into login_log (lo_des,lo_time,u_id) value('登录成功',#{lotime},#{uid})")
	public int up(LoginLog ll);
}
