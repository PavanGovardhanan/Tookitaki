package commonMethods;
import java.net.MalformedURLException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Config {
	public static WebDriver driver;
	public static void getDriver() throws MalformedURLException {
		String browserName = Utils.getDataFromTestConfig("AppBrowser");
		String chrome = Utils.getDataFromTestConfig("ChromeDriverPath");
		String firefox = Utils.getDataFromTestConfig("FirefoxDriverPath");
		String ie = Utils.getDataFromTestConfig("IEDriverPath");

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome1");
			System.out.println("Browser launched...");
			driver = new ChromeDriver();
			//ATUReports.setWebDriver(driver);
			driver.manage().window().maximize();
			//ATUReports.indexPageDescription = Testcases.project_Name;
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			//ATUReports.setWebDriver(driver);
			driver.manage().window().maximize();
			//ATUReports.indexPageDescription = Testcases.project_Name;

		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//ATUReports.setWebDriver(driver);
			driver.manage().window().maximize();
			//ATUReports.indexPageDescription = Testcases.project_Name;
		}
	}

	public static void tearDown() throws Exception {
		try {
			driver.close();
			driver.quit();
		} catch (Exception e) {
			System.out.println("Browser not closed" + e);
		}
	}
}
