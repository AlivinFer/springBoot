package com.alivin;

import com.alivin.pojo.Cat;
import com.alivin.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ApplicationTests {

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        // Person(name=fer, age=18, happy=true,
        // birth=Thu Aug 10 00:00:00 CST 2000, maps={k1=v1, k2=v2},
        // lists=[code, music, shopping], cat=Cat(name=嘟嘟嘟, age=5))
        System.out.println(person);
    }

}
