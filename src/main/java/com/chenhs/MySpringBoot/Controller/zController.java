package com.chenhs.MySpringBoot.Controller;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zController {
	private Logger log;

	public zController() {
		log = LoggerFactory.getLogger(this.getClass());
	}

	@GetMapping(value = "/dodo/{str}", produces = "application/json")
	public String dodo(@PathVariable String str) {
		return "cccccccccc: " + str;
	}

	@GetMapping(value = "/dodo1", produces = "application/json")
	public String dodo1(@RequestParam("a") String str) {
		return "cccccccccc: " + str;
	}

	@GetMapping(value = "/dodo2", produces = "application/octet-stream")
	public byte[] getStream(@RequestParam("a") String str) {
		String s = "this is from stream: " + str;
		log.error(s);
		byte[] ret = new byte[0];
		try {
			ret = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return ret;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "/dodo1", consumes = "application/json", produces = "application/json")
	public String dodo1() {
		// AA a = new AA("a", "b", "c", 1, 2, 3);
		String a = "cccccccccccc";
		return a;
	}
}
