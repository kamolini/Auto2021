package util.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoF {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of link : "+a);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int x =  list.size();
		
		for(WebElement e : list) {
			System.out.println(e.getAttribute("href"));
		}
		
		System.out.println("Total number of link : "+x);
		Thread.sleep(5000);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("Kamolesh");
		String s = searchBox.getAttribute("value");
		System.out.println("before refresh - "+s);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		s = searchBox.getAttribute("value");
		System.out.println("after refresh - "+s);	
	} 
}
