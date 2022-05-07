package util.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alt {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\driver\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/kamol/Desktop/Tuhin.html");
		Thread.sleep(5000);
		
		driver.findElement(By.id("alert")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		//alert.dismiss();
		alert.accept();
		
		
	}

}
