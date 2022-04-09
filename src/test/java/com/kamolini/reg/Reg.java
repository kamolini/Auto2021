package com.kamolini.reg;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import testUtil.ApiUtil;

import static io.restassured.RestAssured.*;

public class Reg {
	
	@Test
	public void rTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.kamolini.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=' Login']")).click();
		
		driver.findElement(By.xpath("//a[text()=' Create an Account']")).click();
		
		String fName = "Shuvro";
		String mName = "Kamol";
		String lName = "Bachar";
		
		driver.findElement(By.name("fname")).sendKeys(fName);
		driver.findElement(By.name("mname")).sendKeys(mName);
		driver.findElement(By.name("lname")).sendKeys(lName);
		driver.findElement(By.name("phone")).sendKeys("1212521212");
		
		Thread.sleep(2000);
		
		WebElement email =  driver.findElement(By.name("email"));
		
		WebElement signup_Button = driver.findElement(By.id("reg"));
		
		String disabledAttribute = signup_Button.getAttribute("disabled");
		Assert.assertEquals(Boolean.parseBoolean(disabledAttribute), true);
		
		Assert.assertEquals(signup_Button.isEnabled(), false);

		Thread.sleep(1000);
		String uid = UUID.randomUUID().toString();
		String userEmail = uid+"@gmail.com";
		System.out.println(userEmail);

		email.sendKeys(userEmail);
		
		Thread.sleep(2000);
		Assert.assertEquals(signup_Button.isEnabled(), true);
		
		Thread.sleep(5000);
		
		signup_Button.click();
		Thread.sleep(10000);
		
		
		
		String otp = ApiUtil.getOtp(userEmail);
		
		driver.findElement(By.id("otp")).sendKeys(otp);
		driver.findElement(By.xpath("//*[text()='Verify']")).click();
		
		Thread.sleep(5000);
		
		String name = driver.findElement(By.xpath("//h1")).getText();
		
		Assert.assertEquals(name.trim(), "Hi, "+fName+" "+mName+" "+lName);
		Thread.sleep(5000);
		
		
		System.out.println(" ============ Log in =============");
		driver.get("https://www.kamolini.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' Login']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(userEmail);
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		
		otp = ApiUtil.getOtp(userEmail);

		System.out.println("otp - "+otp);
		
		driver.findElement(By.name("password")).sendKeys(otp);
		driver.findElement(By.id("sign-in")).click();
		
		Assert.assertEquals(name.trim(), "Hi, "+fName+" "+mName+" "+lName);

		
	}

}

