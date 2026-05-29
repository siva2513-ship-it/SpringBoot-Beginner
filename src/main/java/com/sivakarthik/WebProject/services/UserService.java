package com.sivakarthik.WebProject.services;

import java.util.*;
import com.sivakarthik.WebProject.model.User;

public class UserService{
    private List<User> allUsers;

    public UserService(){
        allUsers = new ArrayList<>();
    }

    //C
    public void addUser(String name, String gender, String image){
        User newUser = new User(name, image ,gender, allUsers.size());
        allUsers.add(newUser);
    }

    //R
    public List<User> getAllUsers(){
        return allUsers;
    }

    //U
    
}