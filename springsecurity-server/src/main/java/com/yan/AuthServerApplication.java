package com.yan;

import com.yan.config.RsaKeyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: yan
 * @Date: 2020/4/18 14:04
 * @Description: com.yan
 * @version: 1.0
 */
@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfig.class)
@MapperScan("com.yan.mapper")
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class,args);
    }
}
