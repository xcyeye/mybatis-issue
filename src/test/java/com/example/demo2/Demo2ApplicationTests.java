package com.example.demo2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo2ApplicationTests {
    @Autowired
    private LoginInfoMapper mapper;
    @Test
    void contextLoads() {
        System.out.println(mapper.delete());
    }

}
