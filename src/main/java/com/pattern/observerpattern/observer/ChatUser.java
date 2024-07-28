package com.pattern.observerpattern.observer;

public class ChatUser implements User{

    private String name;

    public ChatUser(String name){
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " received msg " + msg);
    }
}
