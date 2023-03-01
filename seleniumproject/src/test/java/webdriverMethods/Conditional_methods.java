package webdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_methods {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		boolean display_status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		System.out.println("Display status: "+display_status);
		
		WebElement enable_status=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Enabled status: "+enable_status.isEnabled());
		
		WebElement select_status=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection "+select_status.isSelected());
		
		select_status.click();
		
		System.out.println("After Selection "+select_status.isSelected());

	}

}
