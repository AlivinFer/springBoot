package com.alivin.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    // 秒 分 时 日 月 周几
    @Scheduled(cron = "0 35 17 27 7 ?")
    public void schedule() {
        System.out.println("test");
    }
}
