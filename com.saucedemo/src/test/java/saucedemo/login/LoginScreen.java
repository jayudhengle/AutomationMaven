package saucedemo.login;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

class LoginScreen 
{
	
	WebDriver driver;
	String url = "https://www.saucedemo.com/";
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get(url);		
	}
	
	@Test
	public void loginTest()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String header = driver.findElement(By.xpath("//*[@class='app_logo']")).getText();
		
		assertEquals("Swag Labs", header);
		
	

	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();	
	}

}
