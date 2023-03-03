package frames_browsers;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_browsers {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List <WebElement> list=driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//div/a"));
		
		for(WebElement li:list)
		{
			li.click();
		}
		
		Set <String> ids=driver.getWindowHandles();
		for(String id:ids)
		{
			String title=driver.switchTo().window(id).getTitle();
			if(!(title.equals("Automation Testing Practice")))
			{
			System.out.println(title);
			driver.close();
			}
		}

	}

}
