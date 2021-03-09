package com.newer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.Slogan;
import com.newer.dao.SloganDao;
import com.newer.service.SloganService;
@Service
public class SloganServiceImpl implements SloganService{
	@Autowired
	SloganDao sloganDao;
	@Override
	public List<Slogan> allSlogan() {
		return sloganDao.allSlogan();
	}
	

}
