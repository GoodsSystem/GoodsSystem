package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.bean.Slogan;

@Mapper
public interface SloganDao {
	//查询广告
	@ResultMap("s")
	@Select("select *from slogan s,category_slogan sc where s.s_id=sc.s_id")
	public List<Slogan> allSlogan();
	
	//插入广告
	@ResultMap("s")
	@Insert("insert into slogan(s_img,s_link,s_size,s_state) values(#{simg},#{slink},#{ssize},#{sstate})")
	public Integer addslo(Slogan sl);
	
	//查询最大的id
	@Select("select max(s_id) from slogan")
	public Integer selectId();
	
	//修改广告
	@ResultMap("s")
	@Update("update slogan s,category_slogan c set s.s_state=#{sstate},s.s_img=#{simg},s.s_size=#{ssize},s.s_link=#{slink},c.slo_name=#{sloname} where s.s_id=#{sid} and c.s_id=#{sid}")
	public Integer upad(@Param("sstate")Integer sstate,@Param("simg")String simg,@Param("ssize")String ssize,@Param("slink")String slink,@Param("sloname")String sloname,@Param("sid")Integer sid);

	//删除广告
	@Delete("delete c,s from category_slogan c LEFT JOIN slogan s  on s.s_id=c.s_id where c.s_id=#{sid}")
	public Integer del(Integer sid);
	
	//修改状态
	@ResultMap("s")
	@Update("update slogan set s_state=#{sstate} where s_id=#{sid}")
	public Integer uostate(@Param("sid")Integer sid,@Param("sstate")Integer sstate);
}
