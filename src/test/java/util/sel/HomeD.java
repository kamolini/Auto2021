package util.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeD {
	public static void main(String[] args) throws InterruptedException {
		
		String projectDir = System.getProperty("user.dir");
		System.out.println(projectDir);
		
		System.setProperty("webdriver.chrome.driver",projectDir +"\\driver\\chrome\\chromedriver.exe");
		
		String s = System.getProperty("webdriver.chrome.driver");
		System.out.println(s);
		Thread.sleep(5000);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement allDep_mainM = driver.findElement(By.xpath("(//*[text()='All Departments'])[1]"));
		
		actions.moveToElement(allDep_mainM).perform();
		
		Thread.sleep(3000);
		WebElement cleaning_subM = driver.findElement(By.xpath("(//a[text()='Cleaning'])[1]"));
		actions.moveToElement(cleaning_subM).perform();
		
		//actions.moveToElement(cleaning_subM).contextClick().perform();
		WebElement myAccountLink = driver.findElement(By.xpath("(//*[text()='My Account'])[1]"));
		actions.moveToElement(myAccountLink).contextClick().sendKeys(Keys.ARROW_DOWN).build().perform();
		
		
		
		
		
		
		
		
		
		
	
	}

}
