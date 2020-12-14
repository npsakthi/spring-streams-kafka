package com.zeeshan.sk.streams;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface GreetingsStream {

	String INPUT = "greetings-in";
	String OUTPUT = "greetings-out";

	@Input(INPUT)
	public SubscribableChannel inboundGreetings();

	@Output(OUTPUT)
	public MessageChannel outboundGreetings();

}