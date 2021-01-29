package com.chenhs.MySpringBoot.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class AspectDemo {
	private Logger logger;

	public AspectDemo() {
		logger = LoggerFactory.getLogger(this.getClass());
	}

	// @Pointcut("execution(** com.chenhs.MySpringBoot.AOP.service.myService.*(..))")
	@Pointcut("execution(** com.chenhs.MySpringBoot.AOP.service.myService.dodo(..))")
	public void pointcut() {}

	@Before("pointcut()")
	public void before() {
		logger.error("breforeeeeeeeeeeeeeeeeeeeeeeee");
	}

	@After("pointcut()")
	public void after() {
		logger.error("afterrrrrrrrrrrrrrrrrrrrrr");
	}

}
