package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		// 10 seconds wait time for element visibility
		// Initialize elements in the page using PageFactory
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);

	}

	// Reusable click method with WebElement
	public void click(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	// Reusable sendKeys method
	public void sendKeys(WebElement element, String text) {

		element.clear(); // Clear text if the field already has text
		element.sendKeys(text);
	}

//	// Wait for an element to be visible
//	private void waitForElement() {
//	
//	}

	public void selectoption(WebElement dropdown, String option) {

		Select select = new Select(dropdown);
		select.selectByVisibleText(option);

	}

	public String gettext(WebElement element) {
		return element.getText();
	}

}
