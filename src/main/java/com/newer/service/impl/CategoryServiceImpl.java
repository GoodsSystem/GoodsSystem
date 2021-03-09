package com.newer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.bean.CategorySlogan;
import com.newer.dao.CategorySloganDao;
import com.newer.service.CategorySloganService;
@Service
public class CategoryServiceImpl implements CategorySloganService{
	@Autowired
	CategorySloganDao categorySloganDao;
	@Override
	public Integer addslocate(CategorySlogan cslo) {
		
		return categorySloganDao.addslocate(cslo);
	}

}
