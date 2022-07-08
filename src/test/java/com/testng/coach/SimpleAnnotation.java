package com.testng.coach;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("in beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("in beforeClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in beforeMethod");
	}
	
	//test case 1
	@Test
	public void testCase1() {
		System.out.println("in testCase 1");
	}
	
	//test case 2
	@Test
	public void testCase2() {
		System.out.println("in testCase 2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("in afterMethod");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("in afterClass");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("in afterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("in afterSuite");
	}
}
