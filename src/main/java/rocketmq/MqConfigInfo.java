package rocketmq;

import lombok.Data;

/**
 * MQ参数信息
 * @author 项能
 *
 */
@Data
public class MqConfigInfo {

	private String instance;
	private String group;
	private String namesrvAddr;
	private String topIc;
	private String tagName;
}
