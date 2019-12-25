package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTwo 
{
   @Test 
   public void methodTwoA()
   {
 	 System.out.println("Inside methodTwoA of ClassTwo"); 
 	 
 	 System.setProperty("webdriver.gecko.driver","E:\\GeckoDriver\\geckodriver.exe");
 	 
 	 WebDriver driver = new FirefoxDriver();
 	 
 	 driver.get("http://facebook.com");
 	 
 	 driver.close();
   }
   
   public void methodTwoB()
   {
	   System.out.println("Inside methodTwoB of classTwo");
   }
   
}