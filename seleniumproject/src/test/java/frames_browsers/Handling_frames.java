package frames_browsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_frames {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body//p")).clear();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@title='formatting']//button[1]//span")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//body//p")).sendKeys("Welcome to Selenium");

	}

}
