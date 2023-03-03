package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alert1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//div[@class='example']//button[text()='Click for JS Alert']")).click();
		
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		WebElement alert=driver.findElement(By.xpath("//div[@class='example']//button[text()='Click for JS Prompt']"));
		alert.click();
		
		Alert alt=driver.switchTo().alert();
		
		System.out.println( alt.getText());
		
		alt.sendKeys("Welcome");
		
		alt.accept();
		
	}

}
