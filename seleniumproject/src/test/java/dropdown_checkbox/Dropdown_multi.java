package dropdown_checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_multi {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']/li"));
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		for(int i=0;i<options.size();i++)
		{
			String opt=options.get(i).getText();
			if(opt.equals("Java")||opt.equals("MySQL"))
			{
				options.get(i).click();
			}
		}

	}

}
