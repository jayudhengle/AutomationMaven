package saucedemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginScreenTest {
	WebDriver driver;
	String url = "https://www.saucedemo.com";
	String afterLogin;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

	@DataProvider(name = "TestData")
	public Object[][] testData() {
		Object[][] testdata = { { "standard_user", "secret_sauce" }, { "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, { "performance_glitch_user", "secret_sauce", } };

		return testdata;
	}

	@Test(dataProvider = "TestData")
	public void loginScreenTest(String user, String pass) {
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();

		try {
			WebElement afterLoginE = driver.findElement(By.xpath("//*[@class='app_logo']"));
			afterLogin = afterLoginE.getText();
		} catch (Exception e) {
			Assert.assertFalse(true);
		}

		Assert.assertEquals(afterLogin, "Swag Labs");

	}
}
