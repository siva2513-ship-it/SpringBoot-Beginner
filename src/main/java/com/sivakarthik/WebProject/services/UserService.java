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
    public User getOneUser(int id){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }

    public User createUser(User u){
        allUsers.add(u);
        return u;
    }

    public User updateUser(int id, User user){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                allUsers.set(i, user);
                return u;
            }
        }
        return null;
    }
    public void deleteUser(int id){
        for(int i = 0; i < allUsers.size(); i++){
            User u = allUsers.get(i);
            if(u.getId() == id){
                allUsers.remove(i);
                break;
            }
        }
    }
}