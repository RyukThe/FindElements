package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class15 
{
	public static void main(String[] args) 
	{
		WebDriver k =new ChromeDriver();
		k.get("https://www.amazon.in/");
		List<WebElement> l = k.findElements(By.xpath("//a"));
		System.out.println(l.size());
		
		for(WebElement P:l)
		{
			
			System.out.println(P.getText());
		}
		
	}

}
