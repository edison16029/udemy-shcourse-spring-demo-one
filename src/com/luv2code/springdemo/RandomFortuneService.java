package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] fortunes = {
			"You ll be very lucky today",
			"You can turn mud to gold today",
			"The heaven is looking down on you"
	};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		return fortunes[myRandom.nextInt(fortunes.length)];
	}

}
