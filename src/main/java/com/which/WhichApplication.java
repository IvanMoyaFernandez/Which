package com.which;

import com.which.Entity.Smartphone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WhichApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WhichApplication.class, args);
	}

}
