package com.chinikom.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
public class ChinikomConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChinikomConfigServiceApplication.class, args);
	}

}
