package com.chenhs.MySpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class zController {
	@GetMapping(value = "/dodo/{str}")
	public String dodo(@PathVariable String str) {
		return "cccccccccc: " + str;
	}
}
