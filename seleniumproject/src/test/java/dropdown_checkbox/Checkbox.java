package dropdown_checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		/*for(WebElement chkbox:checkboxes)
		{
			chkbox.click();
		}*/
		
		for(int i=3;i<checkboxes.size();i++)
		{
			if(!(checkboxes.get(i).isSelected()))
			{
			checkboxes.get(i).click();
			}
		}	

	}

}
