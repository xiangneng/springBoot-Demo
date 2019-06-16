package rocketmq;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.rocketmq.client.consumer.MessageQueueListener;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import com.alibaba.rocketmq.common.message.MessageQueue;

public class MqConsumerListener implements MessageListenerConcurrently, MessageQueueListener{
	
	@Autowired
	private MqProcess mqProcess;
	@Override
	public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,ConsumeConcurrentlyContext context){
		
		for(MessageExt msg : msgs ){
			//处理类
			mqProcess.process(msg);
		}
		return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
	}
    
	@Override
	public void messageQueueChanged(final String topic, final Set<MessageQueue> mqAll,
            final Set<MessageQueue> mqDivided){
            
            }
	
}
