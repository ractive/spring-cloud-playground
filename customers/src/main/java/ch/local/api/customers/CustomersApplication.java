package ch.local.api.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;

@EnableDiscoveryClient
@EnableHypermediaSupport(type = { HypermediaType.HAL })
@SpringBootApplication
public class CustomersApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomersApplication.class, args);
    }
}
