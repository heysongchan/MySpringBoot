package com.chenhs.MySpringBoot.sqliteDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhs.MySpringBoot.sqliteDemo.Entity.R;
import com.chenhs.MySpringBoot.sqliteDemo.Mapper.RMapper;

@Service(value = "sqliteservive")
public class SqliteService {
	@Autowired
	private RMapper rm;

	public void insert(String id, String name) {
		rm.insert(id, name);
	}

	public List<R> selectAll() {
		List<R> list = rm.selectAll();
		return list;
	}

}
