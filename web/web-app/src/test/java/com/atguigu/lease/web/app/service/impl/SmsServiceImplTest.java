package com.atguigu.lease.web.app.service.impl;

import com.atguigu.lease.web.app.service.SmsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 彭文斌
 * @version 1.0
 */
@SpringBootTest
class SmsServiceImplTest {
    @Autowired
    private SmsService service;

    @Test
    void sendCode() {
        service.sendCode("13610419225","1234");
    }
}