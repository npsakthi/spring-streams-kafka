package com.zeeshan.sk.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.zeeshan.sk.model.Greetings;
import com.zeeshan.sk.streams.GreetingsStream;

@Service
public class GreetingsService {

	private final GreetingsStream greetingsStream;

	public GreetingsService(final GreetingsStream greetingsStream) {
		this.greetingsStream = greetingsStream;
	}

	public void sendGreetings(final Greetings greetings) {
		MessageChannel messageChannel = greetingsStream.outboundGreetings();
		messageChannel.send(MessageBuilder.withPayload(greetings)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}

}
