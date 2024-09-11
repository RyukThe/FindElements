package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class10 
{
	public static void main(String[] args)
	{
		WebDriver m= new ChromeDriver();
		m.get("https://www.youtube.com/");
		
		List<WebElement> sd = m.findElements(By.xpath("//a"));
		int sdd = sd.size();
		System.out.println(sdd);
		
		for(WebElement k :sd)
		{
			System.out.println(k.getText());
			
		}
		
	}

}
