package com.testng.coach;

import org.testng.annotations.Test;

public class SampleTestng {
	
	@Test
	public void HeadCoach() {
		System.out.println("HeadCoach");
	}
	
	@Test(dependsOnMethods = "HeadCoach")
	public void CricketCoach() {
		System.out.println("CricketCoach");
	}
	
	@Test(enabled = false)
	public void FootBallCoach() {
		System.out.println("FootballCoach");
	}
	
	@Test(invocationCount = 2)
	public void RugbyCoach() {
		System.out.println("RugbyCoach");
	}
	
	@Test(priority = -1)
	public void BasketBallCoach() {
		System.out.println("BasketballCoach");
	}
	
	@Test(priority = -2, invocationCount = 4)
	public void TennisCoach() {
		System.out.println("TennisCoach");
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void PrintSum() {
		int a = 0;
		int b = 1/a;
		System.out.println("Valueof b = " +b);
	}
}





