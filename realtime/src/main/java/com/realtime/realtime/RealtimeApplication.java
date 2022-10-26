package com.realtime.realtime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages = "com.realtime.realtime.dao")
public class RealtimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RealtimeApplication.class, args);
    }

}
