package com.example.MariaSanchezmagiceightballservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MariaSanchezMagicEightBallServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MariaSanchezMagicEightBallServiceApplication.class, args);
	}

}
