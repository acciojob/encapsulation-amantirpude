package com.driver;

public class RWOnly {
    private String name;
    public void getName(String name){
        System.out.println(name);
    }
    public void setName(String name){
        this.name = name;
    }
}
