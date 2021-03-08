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
	UsersDao usersDao;

	@Override
	public List<Users> queryAll() {
		// TODO Auto-generated method stub
		return usersDao.login();
	}

}
