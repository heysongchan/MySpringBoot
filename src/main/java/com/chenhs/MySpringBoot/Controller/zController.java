package com.chenhs.MySpringBoot.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zController {
	@GetMapping(value = "/dodo/{str}")
	public String dodo(@PathVariable String str) {
		return "cccccccccc: " + str;
	}

	@CrossOrigin(origins = "*")
	@GetMapping(value = "/dodo1", consumes = "application/json", produces = "application/json")
	public String dodo1() {
		// AA a = new AA("a", "b", "c", 1, 2, 3);
		String a = "cccccccccccc";
		return a;
	}
}
