package launching_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) 
	{
		//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
		//2) open url URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		// 3) Provide username  - admin@yourstore.com
		WebElement txtEmail=driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys("admin@yourstore.com");
		
		  // 4) Provide password  - admin
		WebElement txtPasswd=driver.findElement(By.id("Password"));
		txtPasswd.clear();
		txtPasswd.sendKeys("admin");
		
		//5) Click on Login button 
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		//Verify the title of dashboard page   
        //Exp title : Dashboard / nopCommerce administration
		String act_title="";
		String exp_title="Dashboard / nopCommerce administration";
		
		try
		{
			act_title=driver.getTitle();
		}
		catch(Exception e)
		{
			
		}
		
		//Verify the dashboard label
		String act_label="";
		try
		{
		act_label=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}
		catch(Exception e)
		{
			
		}
		String exp_label="Dashboard";
		
		
		
		if(act_label.equals(exp_label) && act_title.equals(exp_title))
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
