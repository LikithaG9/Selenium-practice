package launching_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("dresses");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.linkText("EN")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.className("a-dropdown-prompt")).click();
		
		driver.findElement(By.xpath("//*[@id=\'icp-currency-dropdown_44\']/span")).click();
		
		driver.findElement(By.className("a-button-input")).click();
		
		

	}

}
