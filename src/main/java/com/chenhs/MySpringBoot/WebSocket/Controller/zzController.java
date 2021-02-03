package com.chenhs.MySpringBoot.WebSocket.Controller;

import java.util.concurrent.BlockingQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Controller;

import com.chenhs.MySpringBoot.WebSocket.Bean.Message;
import com.chenhs.MySpringBoot.WebSocket.Bean.Resp;

@Controller
public class zzController {
	@Autowired
	@Qualifier(value = "bqueue")
	private BlockingQueue<Resp> queue;
	@Autowired
	private SimpMessageSendingOperations sendOper;

	@MessageMapping("/sendMsg")
	public void addMsgToQueue(Message msg) {
		queue.add(new Resp(msg.getName() + "aaaaaaaaaaa"));
		send();
	}

	public Resp send() {
		Resp r = new Resp("default");
		try {
			r = queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sendOper.convertAndSend("/tt/getResponse", r);
		return r;
	}

	// @MessageMapping("/getMsg")
	// public void bb(Message msg) {
	// addMsgToQueue(msg);
	// send();
	// }

}
