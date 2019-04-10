package me.aravindh.rabbitlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.util.Arrays;

public class RabbitMQMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("message= [" + Arrays.toString(message.getBody()) + "]");
    }
}
