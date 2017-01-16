package com.social.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Topic {

	@Getter @Setter private long id;
	@Getter @Setter private String topic;

}
