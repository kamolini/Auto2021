package com.abc.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DD {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']")));
		
		WebElement img1 =  driver.findElement(By.xpath("//ul[@id='gallery']/li[1]/img"));
		WebElement img2 =  driver.findElement(By.xpath("//ul[@id='gallery']/li[2]/img"));
		WebElement img3 =  driver.findElement(By.xpath("//ul[@id='gallery']/li[3]/img"));
		
		
		WebElement t =  driver.findElement(By.id("trash"));
		
		Actions actions = new Actions(driver);

		actions.dragAndDrop(img1, t).build().perform();
		
		Thread.sleep(3000);
		actions.dragAndDrop(img2, t).build().perform();
		
		Thread.sleep(3000);
		actions.dragAndDrop(img3, t).build().perform();	
	}
}
