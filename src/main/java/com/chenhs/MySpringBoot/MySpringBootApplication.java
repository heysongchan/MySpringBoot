package com.chenhs.MySpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import com.chenhs.MySpringBoot.AOP.service.myService;
import com.chenhs.MySpringBoot.Email.EmailService;
import com.chenhs.MySpringBoot.RabbitMQDemo.Service.RabbitMQService;

//@SpringBootApplication
//public class MySpringBootApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootApplication.class, args);
//	}
//
//}
@EnableAsync
@EnableCircuitBreaker
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.chenhs.MySpringBoot*" })
@SpringBootApplication
public class MySpringBootApplication implements CommandLineRunner {
//	@Autowired
//	private MysqlService mysqlService;
	@Autowired
	private myService myservice;
	@Autowired
	private RabbitMQService rs;
	@Autowired
	private EmailService es;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// rabbitTest();
		// dodo();
		// mail();
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

	private void mail() {
		es.send();
	}

}
