package TestCases;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.SelectedProduct;
import testBase.BaseClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertEquals;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SelectedproductTest extends BaseClass {
	
	@Test
	public void addcart()
	{
      List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        
        // Switch to the second window
        driver.switchTo().window(windowHandles.get(1));  // Switch to the second window
        
        // Perform actions on the second window
        System.out.println("Current Window Title: " + driver.getTitle());
        
        // Optionally, switch back to the first window
        driver.switchTo().window(windowHandles.get(1));
		SelectedProduct sp=new SelectedProduct(driver);
		
		String bestsellerString=sp.Getbestsellertext();
		
		String retrievedDateString=sp.getdeliverydate();
		
		
      
        // Step 2: Get the current date and add two days
        LocalDate currentDate = LocalDate.now();
        LocalDate datePlusTwo = currentDate.plusDays(2);

        // Step 3: Format the current date (date + 2 days) to match the retrieved format
        DateTimeFormatter formatterdate = DateTimeFormatter.ofPattern("EEEE, dd MMMM");
        String formattedCurrentDatePlusTwo = datePlusTwo.format(formatterdate);

        // Step 4: Compare the dates
        if (retrievedDateString.equals(formattedCurrentDatePlusTwo)&& bestsellerString.equalsIgnoreCase("#1 Best Seller")) 
		
        	{
        		sp.Clickaddtocart();
        		
        		System.out.println("Totalamount=" +sp.getamount());
        	}
        
        else {
			System.out.println("Not matched desired criteria"+bestsellerString);
			System.out.println("Not matched desired criteria"+retrievedDateString);
			Assert.assertEquals(false, true);
		}
		
	
        	
        }
	}
	

