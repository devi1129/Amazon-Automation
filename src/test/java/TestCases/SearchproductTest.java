package TestCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductsPage;
import testBase.BaseClass;

public class SearchproductTest extends BaseClass {

    @Test
    public void search() throws InterruptedException {
        // Ensure the WebDriver is initialized in the BaseClass setup method before interacting with elements
        HomePage hp = new HomePage(driver);  // Create HomePage instance after driver is initialized
        
      
        // Add a brief delay (use WebDriverWait instead of Thread.sleep for better practice)
    
        
        // Perform dropdown selection
        hp.selectelemet("Books");
        hp.searchinput("Maths");
        
        hp.secondsuggest();
       
        ProductsPage pg=new ProductsPage(driver);
        
        pg.clickdeliverydaycheckbox();
        pg.clickformatcheckbox();
  
       //pg.Adjustslider(1000, 2000);
       pg.submitrange();
       
        
        
         pg.clickfirstbestseller();
         
         
         
         
         
    }
}
