package com.example.test.demotest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class SampleController {

    @GetMapping(value = "/animal",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Animal> helloWorld() {
        return new ResponseEntity<Animal>(new Animal("dog",4),HttpStatus.OK);
    }
}
