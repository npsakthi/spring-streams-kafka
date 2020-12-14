package com.zeeshan.sk.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.zeeshan.sk.model.Greetings;
import com.zeeshan.sk.streams.GreetingsStream;

@Component
public class GreetingsListener {

	@StreamListener(GreetingsStream.INPUT)
	public void handleGreetings(@Payload Greetings greetings) {
		System.out.println("Message: " + greetings.getMessage() + " Timestamp: " + greetings.getTimestamp());
	}

}
