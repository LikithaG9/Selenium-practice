package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");
		
		Thread.sleep(3000);
		
		//relative xpath
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]")).click();
		
		//abs xpath
		WebElement full=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[1]"));
		full.click();
		
		
		//xpath axe
		//child
		driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a")).click();
		
		//parent
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/parent::*")).click();
		
		//siblings
		driver.findElement(By.xpath("//a[text()='Best Sellers']/preceding-sibling::a")).click();
		
		//ancestors
		driver.findElement(By.xpath("//span[@class='nav-logo-locale']/ancestor::a")).click();
		                        
	}

}
