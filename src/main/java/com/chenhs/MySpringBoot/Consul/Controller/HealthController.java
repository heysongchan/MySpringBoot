package com.chenhs.MySpringBoot.Consul.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	@GetMapping(value = "/health")
	public String health() {
		return "200";
	}
}
