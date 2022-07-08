package com.testng.coach;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryanalyse {

	
	@Test(retryAnalyzer = RetryAnalyse.class ) 	  	
	private void uName() {
		String expected = "subhash";
		String actual = "subhash";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(retryAnalyzer = RetryAnalyse.class)
	private void passWord() {
		int expected = 12345;
		int actual = 54321;
		Assert.assertEquals(actual, expected);
	}
}
