package com.example.servicefeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ServiceFeignServiceHystrix implements FallbackFactory<IServiceFeignService> {
    @Override
    public IServiceFeignService create(Throwable cause) {
        return (String name) -> "Sorry, " + name + ". " + cause.toString();

//        return new IServiceFeignService() {
//            @Override
//            public String sayHiFromServiceHi(String name) {
//                return "Sorry, " + name + ". " + cause.toString();
//            }
//        };
    }
}

//@Component
//public class ServiceFeignServiceHystrix implements IServiceFeignService {
//    public String sayHiFromServiceHi(String name) {
//        return "Sorry, " + name + ".";
//    }
//}
