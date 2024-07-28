package com.pattern.observerpattern.subject;

import com.pattern.observerpattern.observer.User;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements ChatRoom{

    List<User> users = new ArrayList<>();
    private String msg;

    public GroupChat(){
        users = new ArrayList<>();
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void notifyUsers() {
        for(User u : users){
            u.update(msg);
        }
    }

    public void sendMsg(String msg){
        this.msg = msg;
        notifyUsers();
    }
}
