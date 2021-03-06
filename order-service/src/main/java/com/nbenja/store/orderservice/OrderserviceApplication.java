package com.nbenja.store.orderservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrderserviceApplication {

	public static void main(String[] args) {
		//SpringApplication.run(OrderserviceApplication.class, args);

		//New Fluent Application Builder API, where we can build applicationContext hierachy
		new SpringApplicationBuilder(OrderserviceApplication.class).web(WebApplicationType.SERVLET).run(args);

	}

}

