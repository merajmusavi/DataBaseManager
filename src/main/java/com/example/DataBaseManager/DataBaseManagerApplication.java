package com.example.DataBaseManager;

import com.example.DataBaseManager.users.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataBaseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseManagerApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner(UserRepository u){
return args -> {
	System.out.println(u.findAll().toString());
};
	}
}
