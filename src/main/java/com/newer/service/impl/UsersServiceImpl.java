package com.newer.service.impl;

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

}
