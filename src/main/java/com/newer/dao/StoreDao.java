package com.newer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.bean.Store;

@Mapper
public interface StoreDao {

	public List<Store> selstore();

	public List<Store> noPassStore();

	public Integer delstore(int stoid);

	public Store detstore(int stoid);

	public List<Store> fuzzyquery(String n);

	@Update("update store set sto_state=#{stostate} where sto_id=#{stoid}")
	public Integer upstore(Store store);

	@Update("update store set sto_state=#{stostate},sto_reason=#{storeason} where sto_id=#{stoid}")
	public Integer refusestore(Store store);
}
