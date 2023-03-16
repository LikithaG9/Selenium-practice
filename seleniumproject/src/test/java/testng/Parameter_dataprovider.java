package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Parameter_dataprovider 
{
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dataProvider="data1")
	public void login(String uname,String pwd)
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@DataProvider(name="data1")
	String[][] data()
	{
		String data[][]= {
				{"Admin","admin@123"},
				{"admin","admin123"},
				{"Admin","admin123"}
				
		};
		return data;
	}
	
}
