package com.tablenine.eight.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIp("20.20.20.20");
		serverInfo.setPort("802");
		return serverInfo;
	}
}
