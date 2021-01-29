package com.chenhs.MySpringBoot.AOP.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class myService {
	public void dodo() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.error("dodododododododododododo");
	}
}
