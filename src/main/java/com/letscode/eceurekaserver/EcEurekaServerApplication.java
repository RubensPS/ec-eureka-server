package com.letscode.eceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcEurekaServerApplication.class, args);
    }

}
