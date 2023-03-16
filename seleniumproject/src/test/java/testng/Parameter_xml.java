package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Parameter_xml 
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"url","browser"})
	public void open(String u,String b)
	{
		if(b.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(u);
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void title()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
	}
	
	@AfterClass
	public void close()
	{
		driver.quit();
	}

  
}
