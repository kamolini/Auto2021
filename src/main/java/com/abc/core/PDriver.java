package com.abc.core;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.util.Util;

public class PDriver {
	static WebDriver driver = null;
	
	public WebDriver createDriver() throws IOException, InterruptedException {
		
		ReadProperty configProperty = new ReadProperty("config");
		ReadProperty envProperty = new ReadProperty("envURL");
		
		String browserName = null;
		String browser = System.getProperty("browser");
		String remote = System.getProperty("remote");

		if(browser != null) {
			browserName = browser;
		}else {
			browserName = configProperty.getKeyValue("browser");
		}
		
		if(remote != null) {
			
		}else {
			remote = "false";
		}
		
	
		if(remote.equals("true")) {
			System.out.println("Remote");
			DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
			//capabilities.setVersion("99");
			driver =new RemoteWebDriver(new URL("http://192.168.192.1:4444/wd/hub"), capabilities);
		}else {
			System.out.println("Local");
			System.out.println(browserName);
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") +"\\driver\\IE\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}else {
				
			}
		}
		Thread.sleep(5000);
		setDimension();
		
		String testEnv = configProperty.getKeyValue("env");
		String testUrl = envProperty.getKeyValue(testEnv);
		
		driver.get(testUrl);
	
		return driver;
	}
	
	public void setDimension() throws IOException {
		ReadProperty configProperty = new ReadProperty("config");
		String deviceValue = configProperty.getKeyValue("device"); // Key name from config.properties file

		if(!deviceValue.equalsIgnoreCase("")) {
			ReadProperty deviceProperty = new ReadProperty("deviceDimension"); // properties file name
			String d = deviceProperty.getKeyValue(deviceValue);
			System.out.println();
			String xy[] = d.split("X");
					
			int x = Integer.valueOf(xy[0]) /*new Integer(xy[0])*/;
			int y = new Integer(xy[1]);
			
			System.out.println(x+"-"+y);
			
			driver.manage().window().setSize(new Dimension(x, y));
		}
	}
	
	public void fillText(WebElement element, String text) {
		System.out.println("test data -"+text);
		element.sendKeys(text);
	}
	
	public void click(WebElement element) {
		System.out.println("Click");
		if(isDisplayed(element)) {
			element.click();
		}
	}
	
	public void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void switchToframeByWebElement(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public boolean isDisplayed(WebElement element) {
		return new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();

	}
	
	public static void takesScreenshot() {

		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dFile = new File(System.getProperty("user.dir")+"/SS/"+Util.getRandomString()+".png");
		try {
			FileUtils.copyFile(file, dFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void addGreenBorder(WebElement element) {
		JavascriptExecutor executor = ((JavascriptExecutor)driver);
		executor.executeScript("arguments[0].setAttribute('style', 'border : 2px solid green');", element);
	}
	public void removeBorder(WebElement element) {
		JavascriptExecutor executor = ((JavascriptExecutor)driver);
		executor.executeScript("arguments[0].setAttribute('style', '');", element);
	}
	
	public void scrollPageByPx(int px) {
		scrollPageByPx(0,px);
	}
	
	public void scrollPageByPx(int fromPX, int toPX) {
		JavascriptExecutor executor = ((JavascriptExecutor)driver);
		executor.executeScript("scroll("+fromPX+","+toPX+")");
	}
	
	public void scrolltoView(WebElement element) {
		JavascriptExecutor executor = ((JavascriptExecutor)driver);
		executor.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	
	

}
