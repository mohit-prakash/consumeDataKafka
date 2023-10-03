package com.mps.consumeData.service;

import com.mps.consumeData.dto.MsgBox;
import com.mps.consumeData.dto.MsgDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ConsumerService {

    MsgBox msgBox = new MsgBox();
    @KafkaListener(topics="firstTopic",groupId = "group1")
    public void consumer1(String msg){
        log.info("Consumer1: "+msg);
    }

    @KafkaListener(topics="firstTopic",groupId = "group1")
    public void consumer2(String msg){
        msgBox.getMsgBoxes().add(new MsgDto("c2 "+msg));
    }

    public List<MsgDto> getMsgBoxes(){
        return msgBox.getMsgBoxes();
    }
}
