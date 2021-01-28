package com.chenhs.MySpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.chenhs.MySpringBoot.mysqlDemo.Entity.RR;
import com.chenhs.MySpringBoot.mysqlDemo.service.MysqlService;
import com.chenhs.MySpringBoot.quartzDemo.Task;

//@SpringBootApplication
//public class MySpringBootApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootApplication.class, args);
//	}
//
//}
@ComponentScan(basePackages = { "com.chenhs.MySpringBoot*" })
@EnableScheduling
@SpringBootApplication
public class MySpringBootApplication implements CommandLineRunner {
	@Autowired
	private MysqlService ss;
	@Autowired
	private Task task;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<RR> selectAll = ss.getAllFromZZ();
		for (RR r : selectAll) {
			System.out.println(r.getId() + " " + r.getPath() + " " + r.getFilename() + " " + r.getDatetime());
		}
		// task.dodo();
		// RR r = new RR();
		// r.setId("cccc");
		// r.setFilename("aaaaaaa");
		// r.setDatetime(new Date());
		// ss.insertIntoZZ(r);
	}

}
