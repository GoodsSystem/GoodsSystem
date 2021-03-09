package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.Users;
import com.newer.dao.UsersDao;
import com.newer.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersDao usersdao;
	
	
	
	@Override
	public Users userslogin(Users u) {
		return  usersdao.login(u) ;
	}



	@Override
	public List<Users> usersserch() {
		return usersdao.findall();
	}



	@Override
	public Users usersearch(int uid) {
		return usersdao.search(uid);
	}



	@Override
	public boolean change(Users u) {
		return usersdao.changemsg(u)>0?true:false;
	}



	@Override
	public Users verpwd(Users u) {
		return usersdao.change(u);
	}



	@Override
	public boolean changepwd(Users u) {
		
		return usersdao.changepassword(u)>0?true:false;
	}



	@Override
	public Boolean changes(Users u) {
		return usersdao.changestate(u)>0?true:false;
	}



}
