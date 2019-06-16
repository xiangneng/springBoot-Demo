package rocketmq;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * 处理类，根据topIC,tagName
 * @author 项能
 *
 */
public class MqProcess {

	public void process(MessageExt msg){
		if("123".equals(msg.getTopic()) && "456".equals(msg.getTags())){
			//业务逻辑处理
		}
	}
}
