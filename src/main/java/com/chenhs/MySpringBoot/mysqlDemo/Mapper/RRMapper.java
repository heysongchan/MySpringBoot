package com.chenhs.MySpringBoot.mysqlDemo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.chenhs.MySpringBoot.mysqlDemo.Entity.RR;

@Mapper
public interface RRMapper {
	public List<RR> selectAll();

	public List<RR> selectAllFromZZ();

	public void insertIntoZZ(RR r);
}
