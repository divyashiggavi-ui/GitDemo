package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Parameters({"URL","APIKey"})
	@Test
	public void Demo(String url,String Key) {
		System.out.println("Hi Uday");
		System.out.println(url+""+Key);
	}
	
	@Test(groups="Smoke")
	public void PGood() {
		System.out.println("Hi Good");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute First");
	}
	
}
