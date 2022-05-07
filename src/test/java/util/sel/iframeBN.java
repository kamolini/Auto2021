package util.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeBN {
	public static void main(String[] args) throws InterruptedException {
		
		String projectDir = System.getProperty("user.dir");
		System.out.println(projectDir);
		
		System.setProperty("webdriver.chrome.driver",projectDir +"\\driver\\chrome\\chromedriver.exe");
		
		String s = System.getProperty("webdriver.chrome.driver");
		System.out.println(s);
		Thread.sleep(5000);
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.barnesandnoble.com/");
		
		driver.findElement(By.xpath("//*[text()=' My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(5000);
		
		WebElement signIn_frame =  driver.findElement(By.xpath("//iframe[@title='Sign in or Create an Account']"));

		driver.switchTo().frame(signIn_frame);
		
		driver.findElement(By.id("email")).sendKeys("test@test.test");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();
		WebElement pAssistance_frame =  driver.findElement(By.xpath("//iframe[@title='Password Assistance']"));
		driver.switchTo().frame(pAssistance_frame);
			
		driver.findElement(By.id("email")).sendKeys("test@test.com");

	}
}
