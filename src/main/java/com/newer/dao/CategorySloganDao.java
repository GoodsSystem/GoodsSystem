package com.newer.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;

import com.newer.bean.CategorySlogan;

@Mapper
public interface CategorySloganDao {
	//插入广告分类
	@ResultMap("cs")
	@Insert("insert into category_slogan(slo_name,s_id) values(#{sloname},#{sid})")
	public Integer addslocate(CategorySlogan cslo);
}
