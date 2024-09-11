package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{
	public static void main(String[] args) 
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		List<WebElement> links = m.findElements(By.xpath("//a"));
		
		int sz = links.size();
		System.out.println(sz);
		
		for(WebElement O:links)
		{
			String text = O.getText();
			System.out.println(text);
		
		}
		
	}

}
