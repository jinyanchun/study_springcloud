package com.uenpay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uenpay.test.Test;

/**
 * @program: study_springcloud
 * @description: 测试
 * @author: jyc
 * * @create: 2020-09-03 17:21
 **/
@Configuration
public class TestConfig {
	
	@Bean
	public Test getTest() {
		return new Test();
	}
	
}
