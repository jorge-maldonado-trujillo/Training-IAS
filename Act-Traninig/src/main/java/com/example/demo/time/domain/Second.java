package com.example.demo.time.domain;

import com.example.demo.common.precondition;

import lombok.Value;

@Value(staticConstructor = "of")
public class Second {
	Integer value;

	public Second(Integer value) {
		precondition.checkNotNull(value);
		precondition.checkArgument(value >= 0 && value <=59);
		this.value = value;
	}
	
	
	

}
