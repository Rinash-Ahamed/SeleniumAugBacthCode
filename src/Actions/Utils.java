package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils extends BrowserFactory {

	public static WebElement getElement(By obj) {

		return driver.findElement(obj);

	}

	public static void sendKeys(By obj, String value) {

		getElement(obj).sendKeys(value);

	}

	public static void click(By obj) {

		getElement(obj).click();

	}

	public static boolean isDisplayed(By obj) {

		return getElement(obj).isDisplayed();
	}

}
