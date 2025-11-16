package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Test
public class Test3 {
	
	public void weLoginCarLoan() {
		System.out.println("WebLogin Car");
	}
	
	@BeforeClass
	public void Bdfroreclass() {
		System.out.println("Before ececuting eny method will execute");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginCarLoan(String urlname) {
		System.out.println("MobileLogin Car");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void BeforeMethodall() {
		System.out.println("i will execute before every  method");
	}
	
	@AfterMethod
	public void AfterMethodall() {
		System.out.println("i will execute AFTER every  method");
	}
	
	@Test(dataProvider="getData")
	public void MobilesignoutcarLoan(String username,String password)
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
		
	}

	
	public void MobileSignOutCarLoan() {
		System.out.println("MobileSignOut Car");
	}
	
	public void PMobileGood() {
		System.out.println("Hi Mobile Good");
	}
	
	@BeforeSuite
	public void Beforeall() {
		System.out.println("I am First");
	}
	
	public void ApiLoginCarLoan() {
		System.out.println("Api Login Car");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combiantion - username password - good credit history= row
				//2nd - username password  - no crdit history
				// 3rd - fraudelent credit history
				Object[][] data= new Object[3][2];
				//1st set 
				data[0][0]="firstsetusername";
				data[0][1]="firstpassword";
				//couloumns in the row are nothing but values for that particualar combination(row)
				
				//2nd set
				data[1][0]= "secondsetusername";
				data[1][1]= "secondpassword";
				
				//3rd set
				data[2][0]="thirdsetusername";
				data[2][1]="thirdpassword";
				return data;
				
				
	
	}
		
}
