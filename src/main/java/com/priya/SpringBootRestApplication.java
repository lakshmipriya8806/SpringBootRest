package com.priya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootRestApplication extends SpringBootServletInitializer {

    @Override
    /**
     * Making the existing @SpringBootApplication class extends SpringBootServletInitializer
     * to support WAR deployment.
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootRestApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootRestApplication.class, args);
    }

}