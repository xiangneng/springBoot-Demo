package com.springboot.Demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springboot.Demo.mybatisdb.service.DbService;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Slf4j
public class springBootTest{
	
	@Autowired
	private DbService dbService;
	
	@Test
	public void dbTest() {
		int i = dbService.selectCount();
		log.info("------:"+i);
	}
}

