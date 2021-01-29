package com.chenhs.MySpringBoot.RabbitMQDemo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {
	@Autowired
	private RabbitTemplate rt;

	public void send(Object obj) {
		// MessageConverter messageConverter = rt.getMessageConverter();
		// MessageProperties props = new MessageProperties();
		// Message message = messageConverter.toMessage(obj, props);
		// // rt.send(message);// exchange和routingkey在配置中配置
		// rt.send("z", "myRoutingkey", message);
		rt.convertAndSend(obj);

	}

	public void receive() {
		Logger logger = LoggerFactory.getLogger(this.getClass());
		Object obj = rt.receiveAndConvert("zz");
		logger.error(obj.toString());

	}
}
