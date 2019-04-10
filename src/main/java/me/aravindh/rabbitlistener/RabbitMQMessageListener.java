package me.aravindh.rabbitlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        byte[] body = message.getBody();
        System.out.println("message= [" + new String(body) + "]");
    }
}
