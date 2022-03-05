package com.abc.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FUpload {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.targetphoto.com/passport-photo.html");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Get Started']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='ezpBuilderWrapper']/iframe")));
		Thread.sleep(3000);
		driver.findElement(By.name("uploadField")).sendKeys("C:\\Users\\kamol\\Desktop\\k.jpg");
		
		System.out.println(driver.findElement(By.name("uploadField")).getAttribute("text"));
		System.out.println(driver.findElement(By.name("uploadField")).getAttribute("value"));
		
		
		
	}
	
	

}
