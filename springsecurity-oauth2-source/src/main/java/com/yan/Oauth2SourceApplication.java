package com.yan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yan.mapper")
public class Oauth2SourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2SourceApplication.class, args);
    }

}
