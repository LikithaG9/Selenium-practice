package mouse_events;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(button).perform();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		
		for(WebElement opt:options)
		{
			if(opt.getText().equals("Cut"))
			{
				opt.click();
				break;
			}
		}
		Thread.sleep(Duration.ofSeconds(1));
		
		driver.switchTo().alert().accept();

	}

}
