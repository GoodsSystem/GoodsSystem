package com.newer.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
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
	@Override
	public Integer addslo(Slogan sl) {
		return sloganDao.addslo(sl);
	}
	@Override
	public Integer selectId() {
		return sloganDao.selectId();
	}
	@Override
	public Integer upad(Integer sstate, String simg, String ssize, String slink, String sloname, Integer sid) {
		return sloganDao.upad(sstate, simg, ssize, slink, sloname, sid);
	}
	
	//删除
	@Override
	public Integer del(Integer sid) {
		return sloganDao.del(sid);
	}
	
	//修改状态
	@Override
	public Integer uostate(Integer sid, Integer sstate) {
		return sloganDao.uostate(sid, sstate);
	}
	
	

	

}
