package com.grow.technical.jenkinsintegration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JenkinsIntegrationApplicationTests {

	public static final Logger LOGGER = LoggerFactory.getLogger(JenkinsIntegrationApplicationTests.class) ;
	@Test
	 contextLoads() {
		LOGGER.info("Assert Equal Spring test class contextLoads method");
		LOGGER.info("Assert Equal Spring test class contextLoads method.  Statement 2");
		Assertions.assertEquals(4, 4);
	}

}
