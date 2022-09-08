package Objects;

import org.openqa.selenium.By;

public interface LoginObjects {

	public static By usernameField = By.id("username");

	public static By passwordField = By.id("password");

	public static By loginButton = By.className("radius");

	public static By loginSuccessMesage = By.id("flash");

}
