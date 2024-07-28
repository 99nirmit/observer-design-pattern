package com.pattern.observerpattern.subject;

import com.pattern.observerpattern.observer.User;

public interface ChatRoom {

    void registerUser(User user);

    void removeUser(User user);

    void notifyUsers();
}
