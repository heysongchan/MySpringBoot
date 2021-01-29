package com.chenhs.MySpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.chenhs.MySpringBoot.AOP.AspectDemo;

/**
 * 
 * 
 * @author chenhs
 *
 */
@EnableAspectJAutoProxy
@EnableScheduling // 启动scheduling
@Configuration
public class Configs {
	@Bean
	public AspectDemo aa() {
		return new AspectDemo();
	}

}
