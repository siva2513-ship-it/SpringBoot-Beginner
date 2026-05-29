package com.sivakarthik.WebProject.model;

public class User {
    private String name;
    private String image;
    private String gender;
    private Integer id;

    //Default Constructor
    public User(){

    }

    //Parameterised Constructor
    public User(String name, String image, String gender, Integer id){
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.id = id;
    }

    //GETTERS AND SETTERS
    public String getName(){
        return this.name;
    }
    public String getImage(){
        return this.image;
    }
    public String getGender(){
        return this.gender;
    }
    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setImage(String image){
        this.image = image;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setId(Integer id){
        this.id = id;
    }
}
