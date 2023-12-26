package com.example.DataBaseManager;

import com.example.DataBaseManager.users.DeActiveModel;
import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@SpringBootApplication
@EnableFeignClients
public class DataBaseManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseManagerApplication.class, args);

	}
	}


