package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver m = new ChromeDriver();
		m.get("file:///D:/MultipleCheckBoxes.html");
		List<WebElement> sa = m.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(sa.size());
		for(WebElement O:sa)
		{
			 O.click();
			 Thread.sleep(250);
		}
		
		
		for(int i=sa.size()-1;i>=0;i--)
		{
			sa.get(i).click();
			Thread.sleep(500);
		}
		
		
	}

}
