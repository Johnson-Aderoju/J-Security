package com.Johnson.Jsecurity.service;

import com.Johnson.Jsecurity.domain.Role;
import com.Johnson.Jsecurity.domain.User;

import java.util.List;

public interface UserService {
    User saveUser (User user);
    Role saveRole (Role role);
    void addRoleToUser (String username, String roleName);
    User getUser(String username);
    List<User>getUser();

}
