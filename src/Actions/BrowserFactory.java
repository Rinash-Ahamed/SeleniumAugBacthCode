package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver driver; // global variable

	public static WebDriver launchBrowser(String browserName, String url) {

		switch (browserName) {

		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			break;

		case "ie":

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

			break;

		}

		driver.manage().window().maximize();

		driver.get(url);

		return driver;

	}

}
