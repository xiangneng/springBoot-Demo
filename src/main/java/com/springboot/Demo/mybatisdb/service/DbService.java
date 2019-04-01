package com.springboot.Demo.mybatisdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Demo.mybatisdb.dao.CrawlerFlowInfoDao;


@Service
public class DbService {

	
	@Autowired
	private CrawlerFlowInfoDao crawlerFlowInfoDao;
	
	public int selectCount() {
		return crawlerFlowInfoDao.findCount();
	}
}
