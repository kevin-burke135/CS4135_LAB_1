package com.example.demo;

import org.h2.server.web.JakartaWebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Registers the H2 web console servlet at /h2-console/* for Spring Boot 4
 * (Jakarta Servlet). Required when H2 console auto-configuration is not on the classpath.
 */
@Configuration
public class H2ConsoleConfig {

	@Bean
	public ServletRegistrationBean<JakartaWebServlet> h2ConsoleServlet() {
		ServletRegistrationBean<JakartaWebServlet> bean = new ServletRegistrationBean<>(
				new JakartaWebServlet(), "/h2-console/*");
		bean.setName("h2Console");
		return bean;
	}
}
