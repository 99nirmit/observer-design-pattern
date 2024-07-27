package com.pattern.observerpattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentConditionsDisplay implements Observer{

    private float temp;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current Condition: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
