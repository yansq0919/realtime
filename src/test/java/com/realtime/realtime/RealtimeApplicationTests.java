package com.realtime.realtime;

import com.realtime.realtime.entity.FileStorage;
import com.realtime.realtime.entity.TTpSeatsColumnConfig;
import com.realtime.realtime.service.TTpSeatsColumnConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RealtimeApplicationTests {
    @Autowired
    private TTpSeatsColumnConfigService tTpSeatsColumnConfigService;

    @Test
    void contextLoads() {
        List<TTpSeatsColumnConfig> tTpSeatsColumnConfigs = tTpSeatsColumnConfigService.queryAllByLimit(0, 1);
//        List<TTpSeatsColumnConfig> tTpSeatsColumnConfigs1=tTpSeatsColumnConfigService.
        System.out.println(tTpSeatsColumnConfigs);
    }
    @Test
    void service2(){
        System.out.println(tTpSeatsColumnConfigService.queryById(1l));

    }
}
