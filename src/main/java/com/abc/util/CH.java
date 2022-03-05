package com.abc.util;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CH {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.DAYS);
		  
		  WebElement firstResult = new
		  WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		  
		  // Waiting 30 seconds for an element to be present on the page, checking //
		  // for its presence once every 5 seconds.
		  
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5));
		  
		  WebElement foo = wait.until(new Function<WebDriver, WebElement>() { 
			  public WebElement apply(WebDriver driver) { 
				  return driver.findElement(By.id("foo"));
			  		} 
			  });
		  
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']")));

		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]/img"));
		WebElement img3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]/img"));

		WebElement t = driver.findElement(By.id("trash"));

		Actions actions = new Actions(driver);

		actions.clickAndHold(img3).build().perform();
		Thread.sleep(3000);

		actions.release(t).build().perform();
		actions.keyDown(Keys.F5).build();

	}

}
