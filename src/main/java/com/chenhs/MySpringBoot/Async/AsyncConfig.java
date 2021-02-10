package com.chenhs.MySpringBoot.Async;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig {
	@Bean
	public Executor myExecutor() {
		ThreadPoolTaskExecutor ret = new ThreadPoolTaskExecutor();
		ret.setCorePoolSize(5);
		ret.setMaxPoolSize(6);
		ret.setQueueCapacity(100);
		ret.setThreadNamePrefix("mypool");
		ret.initialize();

		return ret;
	}
}
