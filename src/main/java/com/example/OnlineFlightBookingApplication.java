package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages = {"com.example.OnlineFlightBookingApplication"})
@SpringBootApplication
public class OnlineFlightBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineFlightBookingApplication.class, args);
	}

}
