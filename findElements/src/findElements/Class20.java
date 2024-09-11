package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class20 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m= new ChromeDriver();
		m.get("file:///D:/MultipleCheckBoxes.html");
		List<WebElement> web = m.findElements(By.xpath("//input"));
		
	for(int i=0;i<=web.size()-3;i++)
	{
		web.get(i).click();
		
	}
	
	for(int o=10;o<=11;o++)
	{
		web.get(o).sendKeys("HellO");
	}	
	
	for(int i=web.size()-3;i>=0;i--)
	{
		web.get(i).click();
		Thread.sleep(200);
	}
	
	for(int o=10;o<=11;o++)
	{
		web.get(o).clear();
		Thread.sleep(200);
	}

	}

}
