package com.example.DataBaseManager.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "jsonPlaceHolder", url = "http://185.238.2.38:6992/api/1703156665JFMDQCKL9EAIYX0")
public interface JsonPlaceHolder
{
    @GetMapping("/listuser")
    List<Users> users();



}
