package com.chenhs.MySpringBoot.RabbitMQDemo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitListenerr {
	private Logger logger;

	public RabbitListenerr() {
		logger = LoggerFactory.getLogger(this.getClass());
	}

	@RabbitListener(queues = { "zz" })
	public void onMessageArrived(Message msg) {
		logger.error(msg.toString());
	}
}
