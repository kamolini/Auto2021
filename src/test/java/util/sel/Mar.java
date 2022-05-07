package util.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mar {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);

		
		WebElement feelingElement =  driver.findElement(By.xpath("//input[@id='gbqfbb']"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(feelingElement).perform();
		
		Thread.sleep(1000);
		WebElement latestEle =  driver.findElement(By.xpath("//div[@class='gbqfba gbqfba-hvr']"));
		String latestValue = latestEle.getAttribute("aria-label");
		
		int count = 0;
		
		while (!latestValue.equalsIgnoreCase("I'm Feeling Hungry")) {
			count ++;
			System.out.println(count+". "+latestValue);
			Thread.sleep(250);
			WebElement search =  driver.findElement(By.xpath("//input[@id='gbqfbb']/../*[1]"));
			actions.moveToElement(search).perform();
			Thread.sleep(250);
			//feelingElement = driver.findElement(By.xpath("//input[@id='gbqfbb']"));
			actions.moveToElement(feelingElement).perform();
			
			Thread.sleep(250);
			latestEle =  driver.findElement(By.xpath("//div[@class='gbqfba gbqfba-hvr']"));
			latestValue = latestEle.getAttribute("aria-label");
		}
		System.out.println(count+1+". "+latestValue);
		
	}

}
