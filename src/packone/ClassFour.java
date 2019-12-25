package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ClassFour 
{
	   @Test 
	   public void methodFourA()
	   {
	 	 System.out.println("Inside methodFourA of ClassFour"); 
	 	 
	 	 System.setProperty("webdriver.gecko.driver","E:\\GeckoDriver\\geckodriver.exe");
	 	 
	 	 WebDriver driver = new FirefoxDriver();
	 	 
	 	 driver.get("http://yahoo.com");
	 	 
	 	 driver.close();
	
	   }

}
