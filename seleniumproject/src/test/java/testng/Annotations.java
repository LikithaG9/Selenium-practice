package testng;

import org.testng.annotations.*;

public class Annotations {

	@Test(priority=1)
	public void m1()
	{
		System.out.println("method 1");
	}
	
	@Test(priority=2)
	public void m2()
	{
		System.out.println("method 2");
	}
	
	@BeforeSuite
	public void m3()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void m4()
	{
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void m5()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void m6()
	{
		System.out.println("After test");
	}
	
	@BeforeClass
	public void m7()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void m8()
	{
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void m9()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void m10()
	{
		System.out.println("After method");
	}

}
