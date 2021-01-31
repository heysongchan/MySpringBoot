package com.chenhs.MySpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.chenhs.MySpringBoot.AOP.service.myService;
import com.chenhs.MySpringBoot.RabbitMQDemo.Service.RabbitMQService;

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
//	@Autowired
//	private MysqlService mysqlService;
	@Autowired
	private myService myservice;
	@Autowired
	private RabbitMQService rs;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rabbitTest();
	}

	private void dodo() {
		// Logger logger = LoggerFactory.getLogger(this.getClass());
//		List<RR> selectAll = mysqlService.getAllFromZZ();
//		for (RR r : selectAll) {
//			logger.warn(r.getId() + " " + r.getPath() + " " + r.getFilename() + " " + r.getDatetime());
//		}
		// task.dodo();
		// RR r = new RR();
		// r.setId("cccc");
		// r.setFilename("aaaaaaa");
		// r.setDatetime(new Date());
		// ss.insertIntoZZ(r);
		myservice.dodo();
	}

	private void rabbitTest() {
		// rs.send("aaaaaaaaaaaaaaaaaaaa");
//		while (1 == 1) {
//			rs.receive();
//		}

	}

}
