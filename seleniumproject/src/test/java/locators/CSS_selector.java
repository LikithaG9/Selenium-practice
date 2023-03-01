package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		 
		//tag with id
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Earphones");
		
		//tag with class
		driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("Headphones");
		
		//tag with attribute
		driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("Phone");
		
		//tag with id & attribute
		driver.findElement(By.cssSelector("input#twotabsearchtextbox[placeholder='Search Amazon.in']")).sendKeys("Bags");

	}

}
