package groupId;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients

public class MicroservicesApplication{
    public static void main(String[] args){
        SpringApplication.run(MicroservicesApplication.class, args);
    }
}
