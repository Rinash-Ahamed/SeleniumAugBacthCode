package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Actions.Utils;

public class PageObjects extends Utils {

	// Example for page object model

	public static By userNameField = By.xpath("//input[@name='username']");

	public static By passwordField = By.xpath("//input[@name='password']");

	public static By loginButton = By.xpath("//button[@type='submit']");

	public PageObjects(WebDriver paramDriver) {

		this.driver = paramDriver;

	}

	public void enterUserName(String value) {
		
		sendKeys(userNameField, value);
	}

	public void enterPassword() {
		
		sendKeys(passwordField, "admin123");

	}

	public void clickLoginButton() {
		
		click(loginButton);

	}

}
