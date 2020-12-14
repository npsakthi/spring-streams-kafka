package com.zeeshan.sk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greetings {

	private long timestamp;
	private String message;

}
