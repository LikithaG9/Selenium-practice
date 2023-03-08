package mouse_events;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		WebElement Electronics=driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']//div[4]"));
		
		
		
		//WebElement Gaming=driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][normalize-space()='Gaming Laptops']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Electronics).perform();
		WebElement Laptop=driver.findElement(By.xpath("//a[normalize-space()='Laptop and Desktop']"));
		
		act.moveToElement(Electronics).moveToElement(Laptop).click().perform();

	}

}
