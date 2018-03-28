package com.tablenine.eight.ex2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean, DisposableBean {
	String adminId;
	String adminPswd;
	String sub_adminId;
	String sub_adminPswd;

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

	public String getSub_adminId() {
		return sub_adminId;
	}

	public void setSub_adminId(String sub_adminId) {
		this.sub_adminId = sub_adminId;
	}

	public String getSub_adminPswd() {
		return sub_adminPswd;
	}

	public void setSub_adminPswd(String sub_adminPswd) {
		this.sub_adminPswd = sub_adminPswd;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
}
