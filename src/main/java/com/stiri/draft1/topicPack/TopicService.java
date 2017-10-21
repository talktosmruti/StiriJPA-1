package com.stiri.draft1.topicPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	
	
	public void createTopic(Topic inputUserCredential) {
		topicRepository.save(inputUserCredential);
	}
	
	public List<Topic> getAllTopics() {
		List<Topic> topicList=new ArrayList<>();
		for(Topic topic:topicRepository.findAll()) {
			topicList.add(topic);
		}
		
		return topicList;
	}
	
	public Topic findOneTopic(int id) {
		Topic response=null;
		return topicRepository.findOne(id);
	}

	public void deleteTopic(int id) {
		 topicRepository.delete(id);
	}
	
}
