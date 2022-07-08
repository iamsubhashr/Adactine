package com.testng.coach;

import org.testng.annotations.Test;

public class GamesGroups {

	@Test(groups = "sports")
	private void CricketGame() {
		System.out.println("cricket");
	}
	
	@Test(groups = "sports")
	private void VolleyBall() {
		System.out.println("volleyball");
	}
	
	@Test(groups = "sports")
	private void FootBall() {
		System.out.println("football");
	}
	
	@Test(groups = "social")
	private void InstagramPage() {
		System.out.println("instagram");
	}
	
	@Test(groups = "social")
	private void FaceBook() {
		System.out.println("facebook");
	}
	
	@Test(groups = "codingbook")
	private void javaBook() {
		System.out.println("java book");
	}
	
	@Test(groups = "codingbook")
	private void pythonBook() {
		System.out.println("python book");
	}
	
	@Test(groups = "childrensbook")
	private void comicsBook() {
		System.out.println("comics book");
	}
	
	@Test(groups = "childrensbook")
	private void cartoonBook() {
		System.out.println("cartoon book");
	}
	
	
}
