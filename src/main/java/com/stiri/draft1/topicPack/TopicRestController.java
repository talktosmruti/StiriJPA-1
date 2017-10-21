package com.stiri.draft1.topicPack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/topics")
public class TopicRestController {

	@Autowired
	private TopicService topicService;
	
	
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Boolean>  createTopic(@RequestBody Topic topic) {
		System.out.println(topic);
		 topicService.createTopic(topic);
		 return  new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
		
	}
	
	@RequestMapping(value="/{Id}",method=RequestMethod.GET)
	public Topic getTopicById(@PathVariable int id) {
		return topicService.findOneTopic(id);
	}
	
	@RequestMapping(value="/{Id}",method=RequestMethod.DELETE)
	public void deleteTopicById(@PathVariable int id, HttpServletResponse res) {
		 topicService.deleteTopic(id);
		 res.setStatus(202);
	}
	
	
	
}
