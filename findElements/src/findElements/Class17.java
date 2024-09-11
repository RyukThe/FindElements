package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class17 
{
	public static void main(String[] args) 
	{
		WebDriver sd = new ChromeDriver();
		sd.get("https://www.instagram.com/");
		List<WebElement> ds = sd.findElements(By.xpath("//a"));
		for(WebElement l: ds)
		{
			System.out.println(l.getText());
		}
		System.out.println(ds.size());
		
	}

}
