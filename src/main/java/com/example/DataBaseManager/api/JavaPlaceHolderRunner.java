package com.example.DataBaseManager.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JavaPlaceHolderRunner {
    @Bean("javaPlaceHolder")
    CommandLineRunner commandLineRunner(JsonPlaceHolder jsonPlaceHolder){
        return args -> {


            System.out.println("size of posts:");
            List<Users> posts = jsonPlaceHolder.users();

            System.out.println(jsonPlaceHolder.users().toString());


        }
                ;
    }
}
