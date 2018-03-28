package com.tablenine.eight.ex1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	Environment env;
	String adminId;
	String adminPswd;

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPswd() {
		return adminPswd;
	}

	public void setAdminPswd(String adminPswd) {
		this.adminPswd = adminPswd;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		this.adminId = this.env.getProperty("admin.id");
		this.adminPswd = this.env.getProperty("admin.pswd");
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
}
