package com.pattern.observerpattern;

import com.pattern.observerpattern.observer.AngelBroking;
import com.pattern.observerpattern.observer.ChatUser;
import com.pattern.observerpattern.observer.CurrentConditionsDisplay;
import com.pattern.observerpattern.observer.Trader;
import com.pattern.observerpattern.subject.ChatRoom;
import com.pattern.observerpattern.subject.GroupChat;
import com.pattern.observerpattern.subject.StockExchange;
import com.pattern.observerpattern.subject.WeatherData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.WatchEvent;

@SpringBootApplication
public class ObserverpatternApplication {

	public static void main(String[] args) {

//		Weather Forcasting Project
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();


		weatherData.registerObserver(currentConditionsDisplay);

		weatherData.setMeasurements(80,63, 30.4f);
		weatherData.setMeasurements(83,70, 24.4f);

//		Stock Market Updation Project

		StockExchange stockExchange = new StockExchange();

		AngelBroking angelBroking = new AngelBroking();
		stockExchange.registerTrader(angelBroking);

		stockExchange.setStockPrice("IRFC", 189.87);

//		Chat Application Project

		GroupChat groupChat = new GroupChat();

		ChatUser User1 = new ChatUser("User 1");
		ChatUser User2 = new ChatUser("User 2");

		groupChat.registerUser(User1);
		groupChat.registerUser(User2);

		groupChat.sendMsg("Hello, everyone");
	}

}
