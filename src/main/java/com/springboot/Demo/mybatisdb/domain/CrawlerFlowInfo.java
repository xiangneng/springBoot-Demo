package com.springboot.Demo.mybatisdb.domain;

import lombok.Data;

@Data
public class CrawlerFlowInfo {
     private int flowId;
     private int flowType;
     private String flowDesc;
     private String flowSchedule;
}
