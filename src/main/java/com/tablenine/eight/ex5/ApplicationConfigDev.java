package com.tablenine.eight.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIp("localhost2");
		serverInfo.setPort("8282");
		return serverInfo;
	}
}
