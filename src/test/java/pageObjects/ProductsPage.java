package pageObjects;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends BasePage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//span[text()='Get It in 2 Days']/preceding-sibling::div//input[@type='checkbox']")
	WebElement deliverydaycheckboxElement;
	
	@FindBy(xpath="//span[text()='Paperback']/preceding-sibling::div//input[@type='checkbox']")
	WebElement formatcheckboxElement;
	
	@FindBy(xpath="(//span[contains(@id,'best-seller-label')]/following::a)[1]")
	WebElement firstbestseller;
	
	@FindBy(xpath="//input[contains(@id,'lower-bound-slider')]")
	WebElement minsliderElement;
	
	@FindBy(xpath="//input[contains(@id,'upper-bound-slider')]")
	WebElement maxsliderElement;
	
	@FindBy(xpath="//input[contains(@aria-label,' Submit price range')]")
	WebElement submitrangeElement;
	public void clickdeliverydaycheckbox()
	{
		click(deliverydaycheckboxElement);
	}
	
	public void clickformatcheckbox()
	{
		click(formatcheckboxElement);
	}
	
	public void clickfirstbestseller()
	{
		click(firstbestseller);
	}
	
	

	public void submitrange()
	{
		click(submitrangeElement);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	 public void Adjustslider(int minvalue, int maxvalue) {
	       

	      
	        waitForSliderToBeInteractable(minsliderElement);
	        waitForSliderToBeInteractable(maxsliderElement);

	        // Move the min slider to the min value (minValue)
	        moveSliderToValue(minsliderElement, minvalue);

	        // Move the max slider to the max value (maxValue)
	        moveSliderToValue(maxsliderElement, maxvalue);
	    }

	    // Move the slider to the desired value
	    public void moveSliderToValue(WebElement slider, int targetPosition) {
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	         
	    	 js.executeScript("arguments[0].setAttribute('aria-valuetext', '" +targetPosition + "');", slider);

	    }


	    // Wait for the slider to be interactable
	    private void waitForSliderToBeInteractable(WebElement slider) {
	        WebDriverWait wait = new  WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(slider));
	        System.out.println("Slider is interactable now.");
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
