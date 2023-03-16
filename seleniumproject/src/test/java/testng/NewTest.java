package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest
{
	WebDriver driver;
	
  @Test
  public void f() 
  {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void g()
  {
	  driver.findElement(By.xpath("//a[normalize-space()='Amazon miniTV']")).click();
  }
  
  @Test
  public void h()
  {
	  driver.close();
  }
}
