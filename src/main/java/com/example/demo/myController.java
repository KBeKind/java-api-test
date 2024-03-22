package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class myController {

    @PostMapping("/testmessage")
    public ResponseEntity<String> postMessage(@RequestBody myMessage userMessage) {
        System.out.println(userMessage.toString());
        return ResponseEntity.ok("Message received");
    }
}