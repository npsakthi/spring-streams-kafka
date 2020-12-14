package com.zeeshan.sk.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.zeeshan.sk.streams.GreetingsStream;

@EnableBinding(GreetingsStream.class)
public class StreamsConfig {

}
