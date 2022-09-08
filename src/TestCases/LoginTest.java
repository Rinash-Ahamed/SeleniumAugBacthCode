package TestCases;

import java.time.Duration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Actions.Utils;
import Objects.LoginObjects;

public class LoginTest extends Utils implements LoginObjects {

	@BeforeMethod
	public void invokeBrowser() {

		launchBrowser("chrome", "https://the-internet.herokuapp.com/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	// Test Case One

	@Test(priority = 0, description = "This is to test valid login")
	public void positiveLogin() {

		sendKeys(usernameField, "tomsmith");

		sendKeys(passwordField, "SuperSecretPassword!");

		click(loginButton);

		if (isDisplayed(loginSuccessMesage)) {

			System.out.println("Execution Passed");

		} else {

			System.out.println("Execution Failed");
		}

	}
	
	@Test(priority = 1, description = "This is to test invalid login")
	public void negativeLogin() {

		sendKeys(usernameField, "invalid");

		sendKeys(passwordField, "invalid!");

		click(loginButton);

		if (isDisplayed(loginSuccessMesage)) {

			System.out.println("Execution Passed");

		} else {

			System.out.println("Execution Failed");
			
		}

	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

}
