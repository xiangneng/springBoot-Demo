package com.springboot.Demo.mybatisdb.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CrawlerFlowInfoDao {

	int findCount();
}
