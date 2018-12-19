package com.example.servicefeign;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.MessageFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceFeignApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
    public void test(){
        int a;
        for(a=0x10;a<=0x90;a+=0x10){
            for(a+=(a>>4);(a&0xf)<=9;a++) {
                System.out.print(MessageFormat.format("{0}*{1}={2}  ", a >> 4, a & 0xf, (a >> 4) * (a & 0xf)));
            }

            System.out.println("");
            a&=0xf0;
        }
    }

}

