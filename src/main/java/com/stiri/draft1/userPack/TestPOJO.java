package com.stiri.draft1.userPack;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestPOJO {

	@JsonProperty(required = true)
	private String x;
	
	private String y;
	
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}

	
}
