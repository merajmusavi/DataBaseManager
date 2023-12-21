package com.example.DataBaseManager.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RequestMapping(value = "api/v1")
@RestController
public class UserController {
    UserService userService;
    public UserController(UserService service){
        this.userService = service;
    }
    @GetMapping(path = "/all")
    List<DataModel> requst(){
    return userService.allUsers();
    }

    @GetMapping(path = "{userId}")
    Optional<DataModel> dataModel(@PathVariable("userId") Long id){
        return userService.getUserById(id);
    }

    @PostMapping("post")
    void CreateNewUser(@RequestBody DataModel dataModel){
        userService.insertUser(dataModel);
    }

    @DeleteMapping(path = "delete/{userIdToDelete}")
    void deleteUser(@PathVariable("userIdToDelete") Long id){
        userService.deleteUserById(id);
    }

}
