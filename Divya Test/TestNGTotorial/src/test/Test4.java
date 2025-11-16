package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void weLoginHomeLoan() {
		System.out.println("WebLogin Home");
	}
	@Parameters({"URL","APIKey"})
	@Test
	public void MobileLoginHomeLoan(String urlname,String Key) {
		System.out.println("MobileLogin Home");
		System.out.println(urlname+""+Key);
	}
	
	@Test(groups="Smoke")
	public void PHomeGood() {
		System.out.println("Hi Home Good");
	}
	
	@Test
	public void ApiLoginHomeLoan() {
		System.out.println("Api Login Home");
	}
}
