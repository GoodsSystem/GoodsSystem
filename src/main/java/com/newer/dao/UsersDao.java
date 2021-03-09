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
	
	
//	查询所有用户
	public List<Users> findall();
	
	
	
//	通过ID查询当前用户
	public Users search(int uid);

	
//  驗證密碼
	@Select("Select * from users where u_name=#{uname} and u_password=#{upassword}")
	public Users change(Users u);
//	修改密码
	@Update("Update users set u_password=#{upassword} where u_name=#{uname}")
	public int changepassword(Users u);
	
//	修改用户信息
	@Update("update users set u_name=#{uname},u_email=#{uemail} where u_id=#{uid}")
	public int changemsg(Users u);
	
//	修改用户权限
	@Update("update users set u_state=#{ustate} where u_id=#{uid}")
	public int changestate(Users u);
	
}
