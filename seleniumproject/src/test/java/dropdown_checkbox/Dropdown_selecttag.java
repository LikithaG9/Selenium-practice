package dropdown_checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_selecttag {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		WebElement drpdwn_ele=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select drpdown=new Select(drpdwn_ele);
		
		drpdown.selectByVisibleText("Spain");
		
		drpdown.selectByIndex(4);
		
		drpdown.selectByValue("6");
		
		List<WebElement> options=drpdown.getOptions();
		int size=options.size();
		
		for(int i=0;i<size;i++)
		{
			System.out.println(options.get(i).getText());
		}

	}

}
