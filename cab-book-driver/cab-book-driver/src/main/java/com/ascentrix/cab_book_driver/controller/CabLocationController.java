package com.ascentrix.cab_book_driver.controller;

import com.ascentrix.cab_book_driver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/location")
public class CabLocationController {

    @Autowired
    CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int range = 100;
        while (range > 0) {
            cabLocationService.updateLocation(Math.random() +" , "+ Math.random());
            Thread.sleep(2000);
            range --;
        }
        return new ResponseEntity<>(Map.of("message", "Location updated successfully"), HttpStatus.OK);
    }
}
