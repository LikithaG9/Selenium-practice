package mouse_events;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source1=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		
		WebElement target1=driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source1, target1).perform();

	}

}
