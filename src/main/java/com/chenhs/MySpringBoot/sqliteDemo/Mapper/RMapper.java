package com.chenhs.MySpringBoot.sqliteDemo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chenhs.MySpringBoot.sqliteDemo.Entity.R;

@Mapper
public interface RMapper {
	public List<R> selectAll();

	public void insert(@Param("id") String id, @Param("name") String name);
}
