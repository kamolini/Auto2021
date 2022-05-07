package util.sel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Win {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[text()='Maps']/..")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.name("q")).sendKeys("New York");
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//li//*[text()='Search']")).click();
		driver.switchTo().defaultContent();
		
		Set<String> allWin =  driver.getWindowHandles();
		
		
		Iterator<String> it = allWin.iterator();
		
		String mainWin = it.next();
		String childWin1 = it.next();
				
		driver.switchTo().window(childWin1);
		
		driver.findElement(By.name("q")).sendKeys("USA");
		

	}

}
