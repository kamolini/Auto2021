package com.kamolini.reg;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.base.BaseTest;

public class Yah extends BaseTest{
	
	@Test
	public void rTest() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		driver.get("https://www.homedepot.com/");
		
		scrollPageByPx(1500);
		Thread.sleep(2000);
		
		scrollPageByPx(1500, 2500);
		
		Thread.sleep(2000);
		
		scrollPageByPx(2500, 5500);
	}

}
