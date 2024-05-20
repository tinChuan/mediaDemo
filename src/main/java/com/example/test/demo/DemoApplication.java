package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

        @Bean
        public RestTemplate getRestTemplate(){
            System.out.println("test2024");
            return new RestTemplate();
        }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
