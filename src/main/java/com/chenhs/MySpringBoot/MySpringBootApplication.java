package com.chenhs.MySpringBoot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.chenhs.MySpringBoot.mysqlDemo.Entity.RR;
import com.chenhs.MySpringBoot.mysqlDemo.service.MysqlService;

//@SpringBootApplication
//public class MySpringBootApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootApplication.class, args);
//	}
//
//}
@ComponentScan(basePackages = { "com.chenhs.MySpringBoot*" })
@SpringBootApplication
public class MySpringBootApplication implements CommandLineRunner {
	@Autowired
	private MysqlService ss;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		List<RR> selectAll = ss.getAllFromZZ();
		for (RR r : selectAll) {
			logger.warn(r.getId() + " " + r.getPath() + " " + r.getFilename() + " " + r.getDatetime());
		}
		// task.dodo();
		// RR r = new RR();
		// r.setId("cccc");
		// r.setFilename("aaaaaaa");
		// r.setDatetime(new Date());
		// ss.insertIntoZZ(r);
	}

}
