package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_printAllLinksFromFacebookwebpage 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\3rd Sept Mrng\\chromedriver_win32 (1)\\chromedriver.exe");                    //diffClassName.methodName();	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
	}

}