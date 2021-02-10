package com.chenhs.MySpringBoot.Async;

import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class AsyncService {
	@Autowired
	private ApplicationContext context;
	private Logger log;

	public AsyncService() {
		log = LoggerFactory.getLogger(this.getClass());
	}

	public void shutdownExecutor() {
		ThreadPoolTaskExecutor e = (ThreadPoolTaskExecutor) context.getBean("myExecutor");
		e.setWaitForTasksToCompleteOnShutdown(true);
		e.setAwaitTerminationSeconds(6);
		e.shutdown();
	}

	@Async
	public void dodo() {

		log.info("dodo111111111111");
	}

	@Async(value = "myExcecutor")
	public Future<String> dodo1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String str = "dodo111111111111";
		Future<String> ret = new AsyncResult<String>(str);
		return ret;
	}
}
