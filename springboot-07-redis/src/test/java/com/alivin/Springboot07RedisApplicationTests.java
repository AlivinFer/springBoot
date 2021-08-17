package com.alivin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Springboot07RedisApplicationTests {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Test
    void contextLoads() {

        redisTemplate.opsForValue().set("name", "fer");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }

}
