package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class7
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m =new ChromeDriver();
		m.get("https://www.myntra.com/");
		
		 List<WebElement> link = m.findElements(By.xpath("//a"));
		System.out.println(link.size());
		Thread.sleep(500);
		
		for(WebElement O:link)
		{
			String text = O.getText();
			System.out.println(text);
		}
		
		
	}

}
