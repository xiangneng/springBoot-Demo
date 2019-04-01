package com.springboot.Demo.mybatisdb.domain;

import lombok.Data;

@Data
public class CrawlerFlowInfo {
	   private int flowId;
	   private String flowDesc;
	   private int flowType;
	   private String flowSchedule;
}
