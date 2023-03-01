package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		System.out.println("Title: "+driver.getTitle());
		
		System.out.println("Current url: "+driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='navFooter']/div[1]/div/div[1]/ul/li[1]/a")).click();
		                             
		Set<String> handles=driver.getWindowHandles();
		
		for(String id:handles)
		{
			System.out.println(id);
		}

	}

}
