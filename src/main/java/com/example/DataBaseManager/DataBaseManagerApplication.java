package com.example.DataBaseManager;

import com.example.DataBaseManager.users.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
public class DataBaseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseManagerApplication.class, args);

	}

}
