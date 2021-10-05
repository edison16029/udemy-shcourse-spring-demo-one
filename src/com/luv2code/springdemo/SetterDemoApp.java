package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		FootballCoach theCoach = context.getBean("myFootballCoach", FootballCoach.class);
		 
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("My Team is : " + theCoach.getTeam());
		System.out.println("My Email is : " + theCoach.getEmailAddress());
		// close the context
		context.close();

	}

}
