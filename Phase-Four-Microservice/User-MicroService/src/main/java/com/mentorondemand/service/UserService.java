package com.mentorondemand.service;

import com.mentorondemand.entity.ActorsEntity;
import com.mentorondemand.entity.UserDetailsEntity;
import com.mentorondemand.repository.ActorsRepository;
import com.mentorondemand.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository user;
    @Autowired
    ActorsRepository actor;

    public List<UserDetailsEntity> getUsers() {
        List<UserDetailsEntity> list = new ArrayList<>();
        user.findAll().forEach(list::add);
        return list;
    }

    public UserDetailsEntity getUser(Integer id) {
        return user.findById(id).orElse(null);
    }

    public void addUser(UserDetailsEntity usr) {
        ActorsEntity act = usr.getActor();
        act.setUserDetails(usr);
        user.save(usr);
        actor.save(act);
    }

    public ActorsEntity getUsersUserName(String accountType, String userName) {
        return actor.searchUserName(accountType, userName);
    }

    public UserDetailsEntity getUserName(String userName) {
        return user.searchUserName(userName);
    }

    public void deleteUser(Integer id) {
        user.deleteById(id);
    }
}
