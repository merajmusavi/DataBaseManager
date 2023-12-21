package com.example.DataBaseManager.api;

import com.example.DataBaseManager.api.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "jsonPlaceHolder", url = "http://ip:port/api/{token}")
public interface JsonPlaceHolder
{
    @GetMapping("/listuser")
    List<Users> posts();

}
