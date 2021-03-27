package by.ttre16.briana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BrianaDiscovery {
    public static void main(String[] args) {
        SpringApplication.run(BrianaDiscovery.class, args);
    }
}
