package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.newer.bean.Slogan;

@Mapper
public interface SloganDao {
	//查询广告
	@ResultMap("s")
	@Select("select *from slogan")
	public List<Slogan> allSlogan();
}
