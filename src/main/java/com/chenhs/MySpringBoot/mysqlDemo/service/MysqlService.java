package com.chenhs.MySpringBoot.mysqlDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenhs.MySpringBoot.mysqlDemo.Entity.RR;
import com.chenhs.MySpringBoot.mysqlDemo.Mapper.RRMapper;

@Service
public class MysqlService {
	@Autowired
	private RRMapper rrm;

	public List<RR> getAll() {
		List<RR> list = rrm.selectAll();
		return list;
	}

	public List<RR> getAllFromZZ() {
		List<RR> list = rrm.selectAllFromZZ();
		return list;
	}

	public void insertIntoZZ(RR r) {
		rrm.insertIntoZZ(r);
	}
}
