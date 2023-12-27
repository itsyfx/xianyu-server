package com.xianyu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class RedisTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void setValue(){
        System.out.println(stringRedisTemplate.opsForValue().get("test"));
        //redisTemplate.opsForList().leftPushAll("list",new Date());
        List<Object> list = redisTemplate.opsForList().range("list", 0, 1);
        list.forEach(System.out::println);

    }

}
