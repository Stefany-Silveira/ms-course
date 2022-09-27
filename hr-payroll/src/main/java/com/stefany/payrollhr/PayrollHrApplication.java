package com.stefany.payrollhr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PayrollHrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollHrApplication.class, args);
	}

}
