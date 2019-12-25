package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassThree 
{
	   @Test 
	   public void methodThreeA()
	   {
	 	 System.out.println("Inside methodThreeA of ClassThree"); 
	 	 
	 	 System.setProperty("webdriver.gecko.driver","E:\\GeckoDriver\\geckodriver.exe");
	 	 
	 	 WebDriver driver = new FirefoxDriver();
	 	 
	 	 driver.get("http://Amazon.com");
	 	 
	 	 driver.close();
	   }
}
