package com.firsttest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DemoTest2  {
@BeforeSuite
	
	public void setUp() {
	
	
			
		System.out.println("BeforeSuite: SetUp Broswer properties");
			
		
	}
	
	@BeforeClass
	
	public void launchBrowser() {
		
		System.out.println("BeforeClass: Launching Browser");
			
	}
	
	@BeforeMethod
	
	public void enterURL() {
		
		System.out.println("BeforeMethod: Enter URL");
	}
	
	@BeforeTest
	public void login() {
		
		System.out.println("BeforeTest: Login Mentod");
	}
	
	//Test cases -- Stating point 
	
	@Test
	public void add() {
		
		
		
		
		int a = 30;
		int b = 40;
		Assert.assertEquals(70, a+b);
		System.out.println("Test2 : Addition");
		
	
	}
	
	@Test
	public void Sub() {
		
		System.out.println("Test2: Substraction");
		
		int a = 30;
		int b = 40;
		Assert.assertEquals(10, b-a);
		
	
	}
	
	@Test
	public void multiplication() {
		
		System.out.println("Test2: Multiplication");
		
		int a = 2;
		int b = 3;
		Assert.assertEquals(6,a*b);
		
	
	}
	
	@Test
	public void division() {
		
		
		
		
		int a = 30;
		int b = 40;
		Assert.assertEquals(70, a+b);
		System.out.println("Test2 : Devision");
		
		
		
	}
public void divin() {
		
		
		
		
		int a = 30;
		int b = 40;
		Assert.assertEquals(70, a+b);
		System.out.println("Test2 : Devn");
}
	//Post conditions
	@AfterMethod
	
	public void logOut() {
		
		System.out.println("AfterMethod: Log Out of app");
	}
	
	@AfterTest
	
	public void deleteCoolies() {
		
		System.out.println("AfterTest: Delete cookies");
	}
	@AfterClass
	
	public void closeAllBrowser() {
		
		System.out.println("AfterClass: CLose all Browsers");
	}
	
	@AfterSuite
	
	public void generateReport() {
		
		System.out.println("AfterSuite: Report Generation");
	}
	

}
