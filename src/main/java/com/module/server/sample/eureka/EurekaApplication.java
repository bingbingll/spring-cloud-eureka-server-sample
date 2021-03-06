package com.module.server.sample.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO description：eureka server
 *
 * @author bing.li
 * @version v1.0
 * @date 2018/7/4 17:35
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run( EurekaApplication.class, args );
    }
}
