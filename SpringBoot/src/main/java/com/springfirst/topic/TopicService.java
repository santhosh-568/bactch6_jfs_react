package com.springfirst.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
		               
				new Topic("spring","spring framework","Spring description"),
				new Topic("java", "core java","java description"),
				new Topic("junit", "junit&mockito","junit description")
				);
	public List<Topic> getalltopics(){
		return topics;
	}

}
