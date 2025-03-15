package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyload {
	
	public Properties prop;
	
	public Properties getprop()
	{
		try {
			FileInputStream fis = new FileInputStream("./src//test//resources//config.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Error with the location of properties file");
		} catch (IOException e) {
			
			System.out.println("Error while loading properties file");
		}
		
		return prop;
	}
	
	

}
