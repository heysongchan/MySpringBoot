package com.chenhs.MySpringBoot.AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfigs {
	@Bean
	public AspectDemo aa() {
		return new AspectDemo();
	}
}
