package date_pickers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		
		//departure date
		
		String dep_date="22";
		String dep_month="Feb";
		String dep_year="2024";
		
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
		List<WebElement> years=driver.findElements(By.xpath("//select[@aria-label='Select year']//option"));
		
		for(WebElement year:years)
		{
			String yr=year.getText();
			if(yr.equals(dep_year))
			{
				year.click();
			}
		}
		
		driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> months=driver.findElements(By.xpath("//select[@aria-label='Select month']//option"));
		
		for(WebElement month:months)
		{
			String m=month.getText();
			if((month.getText()).equals(dep_month))
			{
				month.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		List <WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));

		for(WebElement dt:dates)
		{
			if((dt.getAttribute("data-date")).equals(dep_date))
			{
				dt.click();
			}
		}

	}

}
