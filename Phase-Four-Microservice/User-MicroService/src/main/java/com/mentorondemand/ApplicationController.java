package com.mentorondemand;

import com.mentorondemand.entity.ActorsEntity;
import com.mentorondemand.entity.UserDetailsEntity;
import com.mentorondemand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicationController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/user-list")
    public List<UserDetailsEntity> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/user/{id}")
    public UserDetailsEntity getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/user/signup")
    public void addUser(@RequestBody UserDetailsEntity user) {
        userService.addUser(user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/user/delete/{id}")
    public void deleteStates(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

    @RequestMapping("/user/login/{accountType}/{userName}")
    public ActorsEntity getUserCred(@PathVariable String accountType, @PathVariable String userName){
        return userService.getUsersUserName(accountType, userName);
    }

    @RequestMapping("/user/login/details/{userName}")
    public UserDetailsEntity getUserName(@PathVariable String userName){
        return userService.getUserName(userName);
    }

}
