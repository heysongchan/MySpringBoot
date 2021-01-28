package com.chenhs.MySpringBoot.quartzDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
	private int count;

	@Scheduled(fixedDelay = 2000)
	public void dodo() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.error("count: " + count++);

	}
}
