package com.chenhs.MySpringBoot.SpringCloud.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class FeignService {
	@FeignClient(value = "cloud01-application")
	public interface zService {
		@GetMapping(value = "/dodo1")
		public String dodo(@RequestParam("a") String name);

		@GetMapping(value = "/dodo2")
		public byte[] dodo2(@RequestParam("a") String name);
	}
}
