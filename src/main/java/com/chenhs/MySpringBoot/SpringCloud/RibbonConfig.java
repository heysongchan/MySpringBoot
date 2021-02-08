package com.chenhs.MySpringBoot.SpringCloud;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@RibbonClients({ @RibbonClient(name = "cloud01-application", configuration = RibbonConfig.class) })
@EnableFeignClients(basePackages = "com.chenhs.MySpringBoot.Consul.Feign*")
@Configuration
public class RibbonConfig {

}
