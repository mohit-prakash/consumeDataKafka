package com.mps.consumeData.controller;

import com.mps.consumeData.dto.MsgDto;
import com.mps.consumeData.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2")
public class ConsumeMsgController {

    @Autowired
    private ConsumerService service;

    @GetMapping("/consumer2")
    public ResponseEntity<?> getMsg(){
        List<MsgDto> msgBoxes = service.getMsgBoxes();
        return new ResponseEntity<>(msgBoxes, HttpStatus.OK);
    }
}
