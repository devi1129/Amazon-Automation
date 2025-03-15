package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	WebElement list_Category;

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchinputElement;

	@FindBy(xpath = "//div[@id='sac-suggestion-row-2']")
	WebElement clicksecondsuggestElement;

	public void selectelemet(String desiredoption) {

		selectoption(list_Category, desiredoption);

	}

	public void searchinput(String text) {
		sendKeys(searchinputElement, text);
	}

	public void secondsuggest() {

		click(clicksecondsuggestElement);
	}
}
