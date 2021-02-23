package com.loan.Loan.Microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.loan.Loan.Microservice")
public class LoanMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMicroserviceApplication.class, args);
	}

}
