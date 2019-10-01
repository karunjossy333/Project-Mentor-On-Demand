package com.mentorondemand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user-list")
    public List<UserDetailsEntity> getUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/{id}")
    public UserDetailsEntity getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/signup")
    public void addUser(@RequestBody UserDetailsEntity user) {
        userService.addUser(user);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/delete/{id}")
    public void deleteStates(@PathVariable Integer id) {
        userService.deleteUser(id);
    }

}
