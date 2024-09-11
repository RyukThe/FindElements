package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getSizeOfMultipleCheckboxes
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium\\chromedriver.exe");                   
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/MultipleCheckBoxes.html");

//		List<WebElement> allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		int size = allcheckboxes.size();
//		System.out.println(size);
		
		int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
		
	}

}