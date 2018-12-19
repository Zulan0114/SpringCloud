package com.example.servicefeign.controller;

import com.example.servicefeign.service.IServiceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceFeignController {

    @Autowired
    private IServiceFeignService serviceFeignService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return serviceFeignService.sayHiFromServiceHi(name);
    }
}
