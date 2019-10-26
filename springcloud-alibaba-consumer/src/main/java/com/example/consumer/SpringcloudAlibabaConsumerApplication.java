package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  consumer 的消费端
 *   添加两个注解
 *          @EnableDiscoveryClient 这个注解开启服务发现
 *          @EnableFeignClents 这个注解是声明Feign远程调用
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringcloudAlibabaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAlibabaConsumerApplication.class, args);
    }

}
