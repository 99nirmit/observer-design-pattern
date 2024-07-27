package com.pattern.observerpattern.subject;


import com.pattern.observerpattern.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
