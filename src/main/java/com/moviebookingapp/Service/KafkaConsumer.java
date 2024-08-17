package com.moviebookingapp.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.moviebookingapp.Config.CommonConstant;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaConsumer {
	
	@KafkaListener(topics=CommonConstant.SEAT_TOPIC,groupId="myGroup")
	public void consumeSeat(String message) {
		Logger log = LoggerFactory.getLogger(message);
		log.info(message);
	}
	
	
//	@KafkaListener(topics=CommonConstant.STATUS_TOPIC,groupId="myGroup")
//	public void consumeStatus(String message) {
//		log.info(message);
//	}

}
