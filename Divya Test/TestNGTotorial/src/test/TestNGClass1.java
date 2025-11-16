package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGClass1 {
	
	@AfterTest
	public void lastExecuation() {
		System.out.println("I am ending the test");
	}
	
	
	@Test
	public void Demo() {
		System.out.println("Hi Divya");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void AfterAll() {
		System.out.println("I am the last Test");
	}
	@Parameters({"URL"})
	@Test
	public void Demo2(String urltest) {
		System.out.println("BYE Divya");
		System.out.println(urltest);
	}

}
