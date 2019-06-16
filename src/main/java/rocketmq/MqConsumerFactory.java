package rocketmq;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;

@Component
public class MqConsumerFactory extends DefaultMQPullConsumer implements InitializingBean{

	@Autowired
	private MqConsumerListener mqConsumerListener;
	@Override
	public void afterPropertiesSet() throws MQClientException{
		//从数据库中拉取所有MQ配置参数存储到List
		List<MqConfigInfo> mqConfigList = new ArrayList();
		//根据参数创建所有的MQ
		for(MqConfigInfo mqConfig : mqConfigList){
			DefaultMQPullConsumer defaultMQPullConsumer = new DefaultMQPullConsumer();
			defaultMQPullConsumer.setInstanceName(mqConfig.getInstance());
			defaultMQPullConsumer.setConsumerGroup(mqConfig.getGroup());
			defaultMQPullConsumer.setNamesrvAddr(mqConfig.getNamesrvAddr());
			try {
				defaultMQPullConsumer.createTopic("123", "456", 2);
			} catch (MQClientException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			defaultMQPullConsumer.setMessageQueueListener(mqConsumerListener);
			defaultMQPullConsumer.start();
		}
		
		
	}
}
