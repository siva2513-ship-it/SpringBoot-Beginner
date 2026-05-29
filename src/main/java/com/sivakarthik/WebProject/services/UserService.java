package com.sivakarthik.WebProject.services;

import java.util.*;
import com.sivakarthik.WebProject.model.User;

public class UserService{
    private List<User> allUsers;

    public UserService(){
        allUsers = new ArrayList<>();
        allUsers.add(new User("John Doe", "/img/newImg.png", "Male", 1));
        allUsers.add(new User("Jane Doe", "/img/newImg2.png", "Female", 2));
    }

    //C

    //R
    public List<User> getAllUsers(){
        return allUsers;
    }

    //U
    
}