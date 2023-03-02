package dropdown_checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_without_select {

	public static void main(String[] args)
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//select[@class='custom-select']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//select[@class='custom-select']/option"));
		
		for(int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("Malta"))
			{
			options.get(i).click();
			}
		}

	}

}
