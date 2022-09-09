package com.tridax.swat.cloud.configuration.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.config.server.environment.EnvironmentController;

@SpringBootTest(properties = { "spring.profiles.active=native" })
public class ConfigurationServiceApplicationTest {

	@Autowired
	private EnvironmentController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}

}
