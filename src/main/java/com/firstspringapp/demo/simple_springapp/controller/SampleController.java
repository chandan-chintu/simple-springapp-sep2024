package com.firstspringapp.demo.simple_springapp.controller;

import com.firstspringapp.demo.simple_springapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/login")
public class SampleController {

    @Autowired
    private Employee employee;

    // writing APIs
    @GetMapping("/getsample")
    public String sampleApi(){
        return "Our first GET API";
    }

    @GetMapping("/getsample2")
    public String sampleApi2(){
        return "Our second GET API";
    }
}
