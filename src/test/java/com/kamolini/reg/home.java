package com.kamolini.reg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.abc.base.BaseTest;

public class home extends BaseTest{
	
	@Test
	public void rTest() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		driver.get("https://www.homedepot.com/");
		
		WebElement element =  driver.findElement(By.xpath("//img[@alt='Husky']"));
		scrolltoView(element);
		
		addGreenBorder(element);
	}

}
