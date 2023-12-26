package com.example.DataBaseManager.users;

import com.example.DataBaseManager.api.JsonPlaceHolder;
import com.example.DataBaseManager.api.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RequestMapping(value = "api/v1")
@RestController
public class UserController {

    UserService userService;

    JsonPlaceHolder jsonPlaceHolder;


    public UserController(UserService service, JsonPlaceHolder jsonPlaceHolder) {
        this.userService = service;
        this.jsonPlaceHolder = jsonPlaceHolder;
    }

    @GetMapping(path = "/all")
    List<DataModel> requst() {
        return userService.allUsers();
    }

    @GetMapping(path = "{userId}")
    Optional<DataModel> dataModel(@PathVariable("userId") Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("post")
    void CreateNewUser(@RequestBody DataModel dataModel) {
        userService.insertUser(dataModel);
    }

    @DeleteMapping(path = "delete/{userIdToDelete}")
    void deleteUser(@PathVariable("userIdToDelete") Long id) {
        userService.deleteUserById(id);
    }

    @GetMapping("usersApi")
    List<Users> users() {
        return jsonPlaceHolder.users();
    }

    @PostMapping("deactive")
    void deActive(@RequestBody DeActiveModel deActiveModel) throws URISyntaxException, IOException, InterruptedException {
        userService.deactiveUser(deActiveModel);
    }

    @GetMapping("detailuser/{username}")
    Optional<User> speceficuserselectionDataDTO(@PathVariable("username") String username) throws URISyntaxException, IOException, InterruptedException {
        return userService.speceficuserselectionDataDTO(username);
    }


}

