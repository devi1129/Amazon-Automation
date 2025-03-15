package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectedProduct extends BasePage {

	public SelectedProduct(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//a/i[contains(@class,'best-seller-badge')]")
	WebElement bestsellerElement;

	@FindBy(xpath = "//div//a[contains(text(),'FREE delivery')]/following-sibling::span")
	WebElement deliverydatElement;

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement cartbuttonElement;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement getamountElement;
	

	public String Getbestsellertext() {
	
		
		return gettext(bestsellerElement);
	}

	public String getdeliverydate() {
	
		return gettext(deliverydatElement);

	}

	public void Clickaddtocart() {
		
		click(cartbuttonElement);
	}
	
	public String getamount() {
		return gettext(getamountElement);
	}

}
