package com.stiri.draft1.topicPack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {

	private String topicName;
	@Id
	@GeneratedValue
	private int topicId;
	
	
	
	
	public Topic(String topicName, int topicId) {
		super();
		this.topicName = topicName;
		this.topicId = topicId;
	}
	
	public Topic() {
		
	}
	
	@Override
	public String toString() {
		return "Topic [topicName=" + topicName + ", topicId=" + topicId + "]";
	}



	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	
	
	
}