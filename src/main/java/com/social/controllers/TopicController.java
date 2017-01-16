package com.social.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.social.entity.Topic;

@RestController
public class TopicController {

	private static final String template = "Topic is %s";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/topic")
	public Topic topic(@RequestParam(value="topic", defaultValue="Usage") String topic){
		return new Topic(counter.incrementAndGet(), String.format(template, topic));
	}
}
