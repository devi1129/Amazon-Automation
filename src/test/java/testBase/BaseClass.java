package testBase;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utilities.Propertyload;

public class BaseClass {

	public Logger logger;
	public Propertyload ld;
	public Properties prop;

	public static WebDriver driver;

	@Parameters({ "browser", "os" }) // Receive both browser and os parameters
	@BeforeSuite
	public void setup(String br, String os) {
		// Initialize logger and properties
		logger = LogManager.getLogger(this.getClass());
		ld = new Propertyload();
		prop = ld.getprop();

		// Initialize WebDriver based on the passed browser type
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			logger.info("Chrome Driver launch is successful");
			break;
		case "edge":
			driver = new EdgeDriver();
			logger.info("Edge Driver launch is successful");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			logger.info("Firefox Driver launch is successful");
			break;
		default:
			System.out.println("No matching browser. Please check the entered browser name");
			return;
		}

		// Launch the website
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

//	@AfterSuite
//	public void teardown() {
//		// Close the browser after tests are complete
//		driver.quit();
//	}

	public String captureScreen(String name) {
		// TODO: Implement screenshot capture logic
		return null;
	}
}
