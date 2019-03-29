package com.springboot.Demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	private static Logger log = LoggerFactory.getLogger(HelloController.class);
	@RequestMapping("/world")
	public String start() {
		log.info("info信息");
		return "hello world!";
	}
}
