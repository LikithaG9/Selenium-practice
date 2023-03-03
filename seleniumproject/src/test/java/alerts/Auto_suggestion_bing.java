package alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion_bing {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAAK_vjAfLgdXWdM0xL_Cxu1CV_62lS_ok_QiFCz0A6PC5BgIfxLWn3ao1ndKTdNjxyjxMIAgLaS8wNO6ArqL3vFB_8JQcBRtZ25mdFukBiEGzqR6Z31q1YXhTFAIUD-6jRkO9Lfz2kxoHWjJQuKrIqbyi9CAy-ybfOVqHzWm58KJU");
		
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("java");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='sa-tray']//ul//span"));
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}

	}

}
