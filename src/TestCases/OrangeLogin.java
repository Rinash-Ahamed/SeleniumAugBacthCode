package TestCases;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Actions.Utils;
import Objects.PageObjects;

public class OrangeLogin extends Utils {

	PageObjects object = new PageObjects(driver);

	@BeforeMethod
	public void invokeBrowser() {

		launchBrowser("chrome", "");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// Test Case One

	@Test(priority = 0, description = "This is to test valid login")
	public void positiveLogin() {

		object.enterUserName("Admin");

		object.enterPassword();

		object.clickLoginButton();
	}

	@Test(priority = 1, description = "This is to test invalid login")
	public void negativeLogin() {

		object.enterUserName("fsdkfdsfj");

		object.enterPassword();

		object.clickLoginButton();

	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

}
