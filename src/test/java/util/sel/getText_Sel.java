package util.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_Sel {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		
		WebElement e =  driver.findElement(By.xpath("//div[@class='szppmdbYutt__middle-slot-promo']/*[1]"));
		String text = e.getText();
		
		System.out.println(text);
		if(text.equals("KAmolesh")) {
			System.out.println("Pass");
		}else {
			System.out.println("Failed");
		}
		Thread.sleep(5000);

		WebElement signIn_link =  driver.findElement(By.xpath("//a[text()='Sign in']"));
		
		signIn_link.click();
		
		System.out.println(driver.getTitle());
	
		
	}

}
