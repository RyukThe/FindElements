package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		m.get("https://www.facebook.com/");
		List<WebElement> kj = m.findElements(By.xpath("//a"));
		for(WebElement O:kj)
		{
			String lk = O.getText();
			System.out.println(lk);
			Thread.sleep(20);
		}
		
	}
	

}
