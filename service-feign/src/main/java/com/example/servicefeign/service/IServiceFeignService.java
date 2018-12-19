package com.example.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "service-hi", fallback = ServiceFeignServiceHystrix.class)
@FeignClient(value = "service-hi", fallbackFactory = ServiceFeignServiceHystrix.class)
public interface IServiceFeignService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromServiceHi(@RequestParam(value = "name") String name);

}
