package com.abc.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.abc.core.PDriver;
import com.abc.core.RL;

@Listeners(RL.class)
public class BaseTest extends PDriver{
	public WebDriver driver = null;
	
	@BeforeMethod(groups ={"SmokeTest"})
	public void bm() throws IOException, InterruptedException {
		driver = createDriver();
	}

}
