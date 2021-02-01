package com.chenhs.MySpringBoot.WebSocket;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

import com.chenhs.MySpringBoot.WebSocket.Bean.Resp;

@Configuration
@EnableWebSocketMessageBroker // 注解开启STOMP协议来传输基于代理的消息，此时控制器支持使用@MessageMapping
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/tt");// topic用来广播，user用来实现p2p
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/myendpoint").withSockJS();
	}

	@Bean
	@Scope(value = WebApplicationContext.SCOPE_SESSION)
	public String dd() {
		return "a";
	}

	@Bean
	public BlockingQueue<Resp> bqueue() {
		return new ArrayBlockingQueue<>(10);
	}

}