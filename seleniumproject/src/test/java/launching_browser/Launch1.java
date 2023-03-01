package launching_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
				
		driver.manage().window().maximize(); // maximize the page
				
				
		Thread.sleep(5000);
				
		driver.findElement(By.name("username")).sendKeys("Admin");
				
		driver.findElement(By.name("password")).sendKeys("admin123");
				
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(5000);
			
		String act_label = "";
		try
		{
		act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e)	{ 
		}
				
		String exp_label="Dashboard";
				
		if(act_label.equals(exp_label))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
				
		driver.quit();
				

	}

}
