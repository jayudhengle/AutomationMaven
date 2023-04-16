package saucedemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginScreenTest 
{
	WebDriver driver;
	String url = "https://www.saucedemo.com";
	String afterLogin;
	
	@BeforeSuite
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();		
	}	
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	@Test
	public void loinScreenTest()
	{
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		afterLogin = driver.findElement(By.xpath("//*[@class='app_logo']")).getText();
		
		Assert.assertEquals(afterLogin, "Swag Labs");


	}	
}
