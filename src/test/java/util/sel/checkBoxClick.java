package util.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxClick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fwww.google.com%2F&hl=en&dsh=S2030293230%3A1635598069512175&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement cb =  driver.findElement(By.id("i3"));
		
		boolean state = cb.isSelected();
		
		System.out.println("state of check box before click > "+state);
		if(state == true) {
			cb.click();
		}
		
		
		state = cb.isSelected();
		System.out.println("state of check box after click > "+state);
		
	}

}
