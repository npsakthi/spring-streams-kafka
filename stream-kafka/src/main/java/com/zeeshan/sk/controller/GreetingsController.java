package com.zeeshan.sk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.sk.model.Greetings;
import com.zeeshan.sk.service.GreetingsService;

@RestController
public class GreetingsController {

	@Autowired
	private GreetingsService greetingsService;

	@GetMapping("/greeting")
	public Greetings greetings(@RequestParam("message") String message) {

		Greetings greetings = Greetings.builder().message(message).timestamp(System.currentTimeMillis()).build();
		greetingsService.sendGreetings(greetings);
		return greetings;
	}
}
