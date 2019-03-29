package com.springboot.Demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.Demo.mybatisdb.service.DbService;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class springBootTest extends TestCase{
	
	@Autowired
	private DbService dbService;
	
	@Test
	public void dbTest() {
		int i = dbService.selectCount();
		log.info("------:"+i);
	}
}

