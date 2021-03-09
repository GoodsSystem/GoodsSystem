package com.newer.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newer.bean.Slogan;

public interface SloganService {
	//查询广告
	public List<Slogan> allSlogan();
	
	//插入广告
	public Integer addslo(Slogan sl);
	
	//查询最大的id
	public Integer selectId();
	
	//更新
	public Integer upad(Integer sstate,String simg,String ssize,String slink,String sloname,Integer sid);
	
	//删除
	public Integer del(Integer sid);
	
	//修改状态
	public Integer uostate(Integer sid,Integer sstate);
}
