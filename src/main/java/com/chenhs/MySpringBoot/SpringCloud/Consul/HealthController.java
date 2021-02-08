package com.chenhs.MySpringBoot.SpringCloud.Consul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	@GetMapping(value = "/health")
	public String health() {
		return "200";
	}
}
