package com.endUser.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
    public void updatedLocation(String value){

        logger.info("the method received the value from producer: "+value);
    }

}
