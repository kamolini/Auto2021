package com.abc.search;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.abc.base.BaseTest;
import com.abc.util.Util;

public class M extends BaseTest{
	
	@Test
	public void m() throws InterruptedException {
		driver.get("https://www.kamolini.com/signIn/v1/login.jsp");
		System.out.println(Util.getRandomEmail());
		
		WebElement element =  driver.findElement(By.xpath("//h1"));
		addGreenBorder(element);
		Thread.sleep(2000);
		removeBorder(element);
		
		
		int x = 9/0;
		
		
		
	}

}
