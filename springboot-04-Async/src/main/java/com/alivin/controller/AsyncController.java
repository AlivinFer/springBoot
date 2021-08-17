package com.alivin.controller;

import com.alivin.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/hello")
    public String hello() {
        asyncService.hello();
        return "hello";
    }

}
