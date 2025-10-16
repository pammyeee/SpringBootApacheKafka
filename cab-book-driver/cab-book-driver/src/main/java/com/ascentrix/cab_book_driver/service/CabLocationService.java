package com.ascentrix.cab_book_driver.service;

import com.ascentrix.cab_book_driver.constants.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {
        kafkaTemplate.send(Constant.CABLOCATION, location);
        return true;
    }
}
