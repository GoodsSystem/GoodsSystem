package com.newer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.LoginLog;
import com.newer.dao.LoginLogDao;

@Service
public class LoginLogService implements com.newer.service.LoginLogService {

	@Autowired
	LoginLogDao loginLogdao;
	
	
	@Override
	public boolean LoginLogsave(LoginLog ll) {
		return loginLogdao.up(ll)>0?true:false;
	}

}
